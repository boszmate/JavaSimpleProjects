package com.mateusz;

import com.mateusz.api.Vehicle;
import com.mateusz.services.Bike;
import com.mateusz.services.Car;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.drive();
        bike.stop();

        car.drive();
        car.stop();
    }
}
