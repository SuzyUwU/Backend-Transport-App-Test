package com.kominfointern.backend_transport.model;

import com.kominfointern.backend_transport.language.jawa;
import jakarta.persistence.*;

@Entity
@Table(name="driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    public static jawa.wilangan driverid, nationaldriverid;
    public static jawa.LarikKarakter drivername, driverroutes, driverlivelocation;
}

