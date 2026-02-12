package com.kominfointern.backend_transport.controller.SaveData;

import com.kominfointern.backend_transport.model.User;
import com.kominfointern.backend_transport.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }
}

