package com.kominfointern.backend_transport.service;

import com.kominfointern.backend_transport.model.User;
import com.kominfointern.backend_transport.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        if (repo.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username already taken");
        }
        return repo.save(user);
    }
}
