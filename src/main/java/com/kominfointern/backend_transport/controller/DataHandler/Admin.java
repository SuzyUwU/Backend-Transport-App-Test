package com.kominfointern.backend_transport.controller.DataHandler;

import com.kominfointern.backend_transport.repository.AdminRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class Admin {

    private final AdminRepository repo;

    public Admin(AdminRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public com.kominfointern.backend_transport.model.Admin createUser(@RequestBody com.kominfointern.backend_transport.model.Admin admin) {
        return repo.save(admin);
    }
}

