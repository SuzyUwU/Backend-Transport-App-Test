package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name="admin")

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public static String loremS;
    public static int loremint;
    public static boolean loremtorf;

}
