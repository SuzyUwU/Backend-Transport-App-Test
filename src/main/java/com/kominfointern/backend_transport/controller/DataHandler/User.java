package com.kominfointern.backend_transport.controller.DataHandler;

import com.kominfointern.backend_transport.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class User {

    private final UserRepository repo;

    public User(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public com.kominfointern.backend_transport.model.User createUser(@RequestBody com.kominfointern.backend_transport.model.User user) {
        return repo.save(user);
    }
}

