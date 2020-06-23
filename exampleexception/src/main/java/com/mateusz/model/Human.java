package com.mateusz.model;

public class Human {
    private int id;
    private String name;
    private String lastname;

    public Human(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
