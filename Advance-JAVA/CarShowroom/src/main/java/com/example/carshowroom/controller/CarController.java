package com.example.carshowroom.controller;

import com.example.carshowroom.entity.Car;
import com.example.carshowroom.entity.CarType;
import com.example.carshowroom.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Car> addCar(@Valid @RequestBody Car car) {
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @PutMapping("/{carNo}")
    public ResponseEntity<Car> updateCar(@PathVariable Long carNo, @Valid @RequestBody Car car) {
        Car updatedCar = carService.updateCar(carNo, car);
        return new ResponseEntity<>(updatedCar, HttpStatus.OK);
    }

    @DeleteMapping("/{carName}")
    public ResponseEntity<Void> deleteCar(@PathVariable String carName) {
        carService.deleteCar(carName);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Car>> getCarsByCarType(@RequestParam CarType carType) {
        List<Car> cars = carService.getCarsByCarType(carType);
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }
}
