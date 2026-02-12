package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String username;
    private int userid;
    private boolean islookingforcar, isoncar;
}
