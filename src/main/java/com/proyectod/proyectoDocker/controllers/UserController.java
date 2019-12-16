package com.proyectod.proyectoDocker.controllers;

import com.proyectod.proyectoDocker.entities.User;
import com.proyectod.proyectoDocker.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        List<User> users =this.userRepository.findAll();

        return users;
    }

}
