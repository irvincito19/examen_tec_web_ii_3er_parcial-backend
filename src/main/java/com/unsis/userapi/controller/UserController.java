package com.unsis.userapi.controller;

import org.springframework.web.bind.annotation.*;
import com.unsis.userapi.entity.UserEntity;
import com.unsis.userapi.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*") // Permite conexión con Vue
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

}
