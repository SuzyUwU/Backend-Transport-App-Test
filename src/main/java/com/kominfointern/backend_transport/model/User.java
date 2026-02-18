package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private int userid;
    private boolean isLookingForCar, isOnCar;

    public String getUsername() {
        return "";
    }
    public String setUsername() {
        return "";
    }
    public String getPassword() {
        return "";
    }
    public String setPassword() {
        return "";
    }
    public long getId() {
        return 0;
    }
    public long setId() {
        return  0;
    }
    public boolean getIsLookingForCar() {
        return false;
    }
    public boolean setIsLookingForCar() {
        return false;
    }
    public boolean getIsOnCar(){
        return false;
    }
    public boolean setIsOnCar(){
        return false;
    }
}
