package com.mateusz.services;

import com.mateusz.api.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive by car.");
    }

    @Override
    public void stop() {
        System.out.println("Stop a car!");
    }
}
