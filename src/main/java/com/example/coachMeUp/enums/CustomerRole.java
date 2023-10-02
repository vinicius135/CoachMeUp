package com.example.coachMeUp.enums;

public enum CustomerRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    CustomerRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}