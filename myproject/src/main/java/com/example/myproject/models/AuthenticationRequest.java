package com.example.myproject.models;

public class AuthenticationRequest {
    private String username;
    private String password;

    public AuthenticationRequest() {
    }

    // Constructor con parámetros
    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Métodos getter y setter para username y password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
