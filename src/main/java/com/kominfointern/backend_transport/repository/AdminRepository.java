package com.kominfointern.backend_transport.repository;

import com.kominfointern.backend_transport.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository
        extends JpaRepository<Admin, Long> {
}

