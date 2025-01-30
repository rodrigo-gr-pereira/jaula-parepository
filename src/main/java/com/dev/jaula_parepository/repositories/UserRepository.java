package com.dev.jaula_parepository.repositories;

import com.dev.jaula_parepository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
