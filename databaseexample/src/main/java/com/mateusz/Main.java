package com.mateusz;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserDao userDao = new UserDao();

    public static void createUser() {
        String name, lastName;
        int age;

        System.out.println("Type a name: ");
        name = scanner.next();

        System.out.println("Type a lastName: ");
        lastName = scanner.next();

        System.out.println("Type your age: ");
        age = scanner.nextInt();

        User user = new User(name, lastName, age);
        userDao.createUser(user);
        //System.out.println("PRINTLN: Create user: " + user.toString());
    }

    public static void deleteUser() {
        String lastName;

        System.out.println("Type a lastName: ");
        lastName = scanner.next();

        userDao.deleteUser(lastName);
    }

    public static void updateUser() {
        String name, lastName;
        int age, id;

        System.out.println("Type user id to update: ");
        id = scanner.nextInt();

        System.out.println("Type a new name: ");
        name = scanner.next();

        System.out.println("Type a new lastName: ");
        lastName = scanner.next();

        System.out.println("Type a new age: ");
        age = scanner.nextInt();

        User user = new User(id, name, lastName, age);
        userDao.updateUser(user);
    }

    public static void main(String[] args) {
        createUser();
        deleteUser();

        UserDao userDao = new UserDao();
        System.out.println(userDao.getAllUsers());

        updateUser();
        System.out.println(userDao.getAllUsers());
    }
}
