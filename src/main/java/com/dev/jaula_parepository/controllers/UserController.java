package com.dev.jaula_parepository.controllers;

import com.dev.jaula_parepository.dtos.UserDTO;
import com.dev.jaula_parepository.entities.User;
import com.dev.jaula_parepository.services.UserPostService;
import com.dev.jaula_parepository.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserPostService userPostService;

    @GetMapping
    public List<UserDTO> findAll() {
        List<UserDTO> result = userService.findAll();
        return result;
    }

    @GetMapping(value = "/page")
    public List<User> listPosts(Pageable pageable){
        return userPostService.listPosts(pageable).getContent();
    }
    

}
