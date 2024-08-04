package com.example.carshowroom.repository;

import com.example.carshowroom.entity.Car;
import com.example.carshowroom.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByCarType(CarType carType);
    void deleteByCarName(String carName);
}
