package com.kominfointern.backend_transport.controller.DataHandler;

import com.kominfointern.backend_transport.repository.DriverRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class Driver {

    private final DriverRepository repo;

    public Driver(DriverRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public com.kominfointern.backend_transport.model.Driver createUser(@RequestBody com.kominfointern.backend_transport.model.Driver driver) {
        return repo.save(driver);
    }
}

