package com.kominfointern.backend_transport.repository;

import com.kominfointern.backend_transport.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository
        extends JpaRepository<Driver, Long> {
}

