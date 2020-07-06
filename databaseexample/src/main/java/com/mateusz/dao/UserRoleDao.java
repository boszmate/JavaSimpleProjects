package com.mateusz.dao;

import com.mateusz.enums.Role;
import com.mateusz.model.UserRole;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRoleDao {
    private Connection connection;
    private final String databaseName = "people";
    private final String tableName = "roles";
    private final String user = "mateusz";
    private final String password = "123";

    public UserRoleDao() {
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

    public List<UserRole> getAllUserRoles() {
        List<UserRole> userRoles = new LinkedList<UserRole>();
        Statement statement = null;

        try {
            String query = "select * from " + tableName;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameRole = resultSet.getString("role");

                userRoles.add(new UserRole(id, Role.valueOf(nameRole)));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userRoles;
    }

    public UserRole getRoleById(Integer id) {
        Statement statement = null;
        try {
            String query = "select * from " + tableName + " where id = '" + id + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nameRole = resultSet.getString("role");

                return new UserRole(id, Role.valueOf(nameRole));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getRoleIdByName(String roleName) {
        Statement statement = null;
        try {
            String query = "select * from " + tableName + " where role = '" + roleName + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                return id;
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
