package com.example.carshowroom.service;

import com.example.carshowroom.entity.Car;
import com.example.carshowroom.entity.CarType;

import java.util.List;

public interface CarService {
    Car addCar(Car car);
    Car updateCar(Long carNo, Car car);
    void deleteCar(String carName);
    List<Car> getCarsByCarType(CarType carType);
}
