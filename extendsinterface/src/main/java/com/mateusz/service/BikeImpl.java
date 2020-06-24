package com.mateusz.service;

public class BikeImpl implements com.mateusz.api.Bike {
    @Override
    public void switchGear() {
        System.out.println("switchGearBike");
    }

    @Override
    public void drive() {
        System.out.println("driveBike");
    }

    @Override
    public void stop() {
        System.out.println("stopBike");
    }

    @Override
    public void turnLeft() {
        System.out.println("turnLeftBike");
    }

    @Override
    public void turnRight() {
        System.out.println("turnRightBike");
    }
}
