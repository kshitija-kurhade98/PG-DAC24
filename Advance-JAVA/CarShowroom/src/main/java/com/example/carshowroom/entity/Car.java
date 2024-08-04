package com.example.carshowroom.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carNo;

    @NotBlank(message = "Car name is mandatory")
    private String carName;

    @NotBlank(message = "Car color is mandatory")
    private String carColor;

    @NotBlank(message = "Car fuel type is mandatory")
    private String carFuelType;

    @NotNull(message = "Car type is mandatory")
    @Enumerated(EnumType.STRING)
    private CarType carType;

    @NotNull(message = "Car price is mandatory")
    private Double carPrice;

    @NotBlank(message = "Car transmission is mandatory")
    private String carTransmission;

    // Getters and Setters
    public Long getCarNo() {
        return carNo;
    }

    public void setCarNo(Long carNo) {
        this.carNo = carNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarFuelType() {
        return carFuelType;
    }

    public void setCarFuelType(String carFuelType) {
        this.carFuelType = carFuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }
}


