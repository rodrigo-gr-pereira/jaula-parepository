package com.dev.jaula_parepository.services;

import com.dev.jaula_parepository.dtos.UserDTO;
import com.dev.jaula_parepository.entities.User;
import com.dev.jaula_parepository.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;


    @Transactional(readOnly = true)
    public UserDTO findById(Long id){
        User result = userRepository.findById(id).get();
        return new UserDTO(result);
    }

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        return result.stream().map(x -> new UserDTO(x)).toList();
    }


}
