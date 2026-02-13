package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name="admin")

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
