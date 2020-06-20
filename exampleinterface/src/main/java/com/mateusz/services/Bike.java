package com.mateusz.services;

import com.mateusz.api.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive by bike.");
    }

    @Override
    public void stop() {
        System.out.println("Stop a bike!");
    }
}
