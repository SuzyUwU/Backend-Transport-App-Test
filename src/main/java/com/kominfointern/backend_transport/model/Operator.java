package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name="operators")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
}
