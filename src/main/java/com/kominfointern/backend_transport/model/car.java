package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")
public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public static String loremS;
    public static int loremint;
    public static boolean loremtorf;
}
