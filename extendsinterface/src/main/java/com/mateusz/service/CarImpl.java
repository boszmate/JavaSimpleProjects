package com.mateusz.service;

public class CarImpl implements com.mateusz.api.Car {
    @Override
    public void pullHandBreak() {
        System.out.println("pullHandBreakCar");
    }

    @Override
    public void abs() {
        System.out.println("absCar");
    }

    @Override
    public void drive() {
        System.out.println("driveCar");
    }

    @Override
    public void stop() {
        System.out.println("stopCar");
    }

    @Override
    public void turnLeft() {
        System.out.println("turnLeftCar");
    }

    @Override
    public void turnRight() {
        System.out.println("turnRightCar");
    }
}
