package com.example.carshowroom.service;

import com.example.carshowroom.entity.Car;
import com.example.carshowroom.entity.CarType;
import com.example.carshowroom.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Long carNo, Car car) {
        Optional<Car> existingCar = carRepository.findById(carNo);
        if (existingCar.isPresent()) {
            Car carToUpdate = existingCar.get();
            carToUpdate.setCarName(car.getCarName());
            carToUpdate.setCarColor(car.getCarColor());
            carToUpdate.setCarFuelType(car.getCarFuelType());
            carToUpdate.setCarType(car.getCarType());
            carToUpdate.setCarPrice(car.getCarPrice());
            carToUpdate.setCarTransmission(car.getCarTransmission());
            return carRepository.save(carToUpdate);
        } else {
            throw new RuntimeException("Car not found with CarNo: " + carNo);
        }
    }

    @Override
    public void deleteCar(String carName) {
        carRepository.deleteByCarName(carName);
    }

    @Override
    public List<Car> getCarsByCarType(CarType carType) {
        return carRepository.findByCarType(carType);
    }
}
