package com.kominfointern.backend_transport.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")
public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicle, plate;

    public long getId(){
        return 0;
    }
    public long setId(){
        return 0;
    }
    public String getVehicle(){
        return "";
    }
    public String setVehicle(){
        return "";
    }
    public String getPlate(){
        return "";
    }
    public String setPlate(){
        return "";
    }
}

