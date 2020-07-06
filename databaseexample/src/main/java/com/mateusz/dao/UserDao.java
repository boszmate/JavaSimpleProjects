package com.mateusz.dao;

import com.mateusz.model.User;
import com.mateusz.model.UserRole;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserDao {
    private Connection connection;
    private final String databaseName = "people";
    private final String tableName = "users";
    private final String user = "mateusz";
    private final String password = "123";
    private UserRoleDao userRoleDao = new UserRoleDao();

    public UserDao() {
        init();
    }

    private void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName + "?useSSL=false", user, password);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new LinkedList<User>();
        Statement statement = null;

        try {
            String query = "select * from " + tableName;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastname");
                int age = resultSet.getInt("age");
                int userRoleId = resultSet.getInt("user_role_id");
                UserRole userRole = userRoleDao.getRoleById(userRoleId);

                User user = new User(id, name, lastName, age, userRole);
                users.add(user);
            }

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    public void createUser(User user) {
        PreparedStatement statement;

        try {
            int roleId = userRoleDao.getRoleIdByName(user.getUserRole().getRole().name());
            String query = "insert into " + tableName + " (name, lastname, age, user_role_id) values(?, ?, ?, ?)";
            statement = connection.prepareStatement(query);

            statement.setString(1, user.getName());
            statement.setString(2, user.getLastName());
            statement.setInt(3, user.getAge());
            statement.setInt(4, roleId);
            System.out.println("user_role_id: " + roleId);
            statement.execute();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String lastName) {
        PreparedStatement statement;

        try {
            String query = "delete from " + tableName + " where lastname = ?";
            statement = connection.prepareStatement(query);

            statement.setString(1, lastName);
            statement.execute();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void updateUser(User user) {
        PreparedStatement statement;

        try {
            int roleId = userRoleDao.getRoleIdByName(user.getUserRole().getRole().name());
            String query = "update " + tableName + " set name = ?, lastname = ?, age = ?, user_role_id = ? where id = ?";
            statement = connection.prepareStatement(query);

            statement.setString(1, user.getName());
            statement.setString(2, user.getLastName());
            statement.setInt(3, user.getAge());
            statement.setInt(4, roleId);
            statement.setInt(5, user.getId());
            statement.execute();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
