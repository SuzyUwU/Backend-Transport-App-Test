package com.kominfointern.backend_transport.repository;

import com.kominfointern.backend_transport.model.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository
        extends JpaRepository<Operator, Long> {
}

