package com.dev.jaula_parepository.services;


import com.dev.jaula_parepository.dtos.UserDTO;
import com.dev.jaula_parepository.entities.User;
import com.dev.jaula_parepository.repositories.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserPostService {

    @Autowired
    UserPostRepository userPostRepository;

    public UserPostService(UserPostRepository userPostRepository){
        this.userPostRepository = userPostRepository;
    }

    public Page<User> listPosts(Pageable pageable){
        return userPostRepository.findAll(pageable);
    }
}
