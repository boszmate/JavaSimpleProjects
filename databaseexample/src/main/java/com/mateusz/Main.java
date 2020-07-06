package com.mateusz;

import com.mateusz.dao.UserDao;
import com.mateusz.dao.UserRoleDao;
import com.mateusz.enums.Role;
import com.mateusz.model.User;
import com.mateusz.model.UserRole;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserDao userDao = new UserDao();
    static UserRoleDao userRoleDao = new UserRoleDao();

    public static void createUser() {
        String name, lastName, role;
        int age;

        System.out.println("Type a name: ");
        name = scanner.next();

        System.out.println("Type a lastName: ");
        lastName = scanner.next();

        System.out.println("Type your age: ");
        age = scanner.nextInt();

        System.out.println("Type user role: [USER, ADMIN] ");
        role = scanner.next();

        User user = new User(name, lastName, age, new UserRole(Role.valueOf(role)));
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
        String name, lastName, role;
        int age, id;

        System.out.println("Type user id to update: ");
        id = scanner.nextInt();

        System.out.println("Type a new name: ");
        name = scanner.next();

        System.out.println("Type a new lastName: ");
        lastName = scanner.next();

        System.out.println("Type a new age: ");
        age = scanner.nextInt();

        System.out.println("Type user role: {USER, ADMIN) ");
        role = scanner.next();

        User user = new User(id, name, lastName, age, new UserRole(Role.valueOf(role)));
        userDao.updateUser(user);
    }

    public static void main(String[] args) {
        System.out.println("User roles: " + userRoleDao.getAllUserRoles());
        createUser();
        deleteUser();

        UserDao userDao = new UserDao();
        System.out.println(userDao.getAllUsers());

        updateUser();
        System.out.println(userDao.getAllUsers());
    }
}
