package com.kominfointern.backend_transport.controller.DataHandler;

import com.kominfointern.backend_transport.repository.OperatorRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operators")
public class Operator {

    private final OperatorRepository repo;

    public Operator(OperatorRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public com.kominfointern.backend_transport.model.Operator createUser(@RequestBody com.kominfointern.backend_transport.model.Operator operator) {
        return repo.save(operator);
    }
}

