package com.dev.jaula_parepository.dtos;

import com.dev.jaula_parepository.entities.User;
import org.springframework.beans.BeanUtils;


public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Double salary;

    public UserDTO(User entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
