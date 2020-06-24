package com.mateusz.service;

public class ShipImpl implements com.mateusz.api.Ship {
    @Override
    public void dropAnchor() {
        System.out.println("dropAnchorShip");
    }

    @Override
    public void swim() {
        System.out.println("swimShip");
    }

    @Override
    public void turnLeft() {
        System.out.println("turnRightShip");
    }

    @Override
    public void turnRight() {
        System.out.println("turnRightShip");
    }
}
