package com.kominfointern.backend_transport.model;

import com.kominfointern.backend_transport.language.jawa.*;
import jakarta.persistence.*;



@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ꦒꦸꦁ id;

    private ꦯꦼꦫꦠꦤ꧀ username;
    private ꦯꦼꦫꦠꦤ꧀ password;
    public static ꦮꦶꦭꦔꦤ꧀ driverId, nationalDriverId;
    public static ꦯꦼꦫꦠꦤ꧀ driverName, driverRoutes, driverLocation;
    public boolean driverIsDriving;

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
    public int getId() {
        return 0;
    }
    public int setId() {
        return  0;
    }
    public boolean getDriverIsDriving() {
        return false;
    }
    public boolean setDriverIsDriving() {
        return false;
    }
    public int getDriverId() {
        return 0;
    }
    public int setDriverId() {
        return  0;
    }
    public int getNationalDriverId() {
        return 0;
    }
    public int setNationalDriverId() {
        return  0;
    }
    public String getDriverName() {
        return "";
    }
    public String setDriverName() {
        return "";
    }
    public String getDriverRoutes() {
        return "";
    }
    public String setDriverRoutes() {
        return "";
    }
    public String getDriverLocation() {
        return "";
    }
    public String setDriverLocation() {
        return "";
    }

}



