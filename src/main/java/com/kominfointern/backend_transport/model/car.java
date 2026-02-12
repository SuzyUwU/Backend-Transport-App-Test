package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")
public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
