package com.mateusz;

import com.mateusz.api.Bike;
import com.mateusz.api.Car;
import com.mateusz.api.Ship;
import com.mateusz.service.BikeImpl;
import com.mateusz.service.CarImpl;
import com.mateusz.service.ShipImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Bike bike = new BikeImpl();
        Ship ship = new ShipImpl();

        car.abs();
        car.pullHandBreak();
        car.drive();
        car.turnLeft();

        bike.switchGear();
        bike.drive();
        bike.turnLeft();

        ship.dropAnchor();
        ship.swim();
        ship.turnLeft();
    }
}
