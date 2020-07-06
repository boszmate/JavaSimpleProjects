package com.mateusz.model;

public class User {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private UserRole userRole;

    public User(String name, String lastName, int age, UserRole userRole) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.userRole = userRole;
    }

    public User(int id, String name, String lastName, int age, UserRole userRole) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", userRole=" + userRole +
                '}';
    }
}
