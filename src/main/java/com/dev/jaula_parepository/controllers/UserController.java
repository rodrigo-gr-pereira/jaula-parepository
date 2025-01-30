package com.dev.jaula_parepository.controllers;

import com.dev.jaula_parepository.entities.User;
import com.dev.jaula_parepository.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> result = repository.findAll();
        return  ResponseEntity.ok(result);
    }
}
