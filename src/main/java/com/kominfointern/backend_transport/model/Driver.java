package com.kominfointern.backend_transport.model;

import com.kominfointern.backend_transport.language.jawa;
import jakarta.persistence.*;

@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private jawa.wilangan id;

    private jawa.LarikKarakter username;
    private jawa.LarikKarakter password;
    public static jawa.wilangan driverId, nationalDriverId;
    public static jawa.LarikKarakter driverName, driverRoutes, driverLiveLocation;
}


