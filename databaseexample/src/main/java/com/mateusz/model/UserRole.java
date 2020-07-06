package com.mateusz.model;

import com.mateusz.enums.Role;

public class UserRole {
    private int id;
    private Role role;

    public UserRole(Role role) {
        this.role = role;
    }

    public UserRole(int id, Role role) {
        this.id = id;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString(){
        return "UserRole{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }


}
