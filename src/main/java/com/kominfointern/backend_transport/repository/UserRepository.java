package com.kominfointern.backend_transport.repository;

import com.kominfointern.backend_transport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}

