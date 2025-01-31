package com.dev.jaula_parepository.repositories;

import com.dev.jaula_parepository.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPostRepository extends PagingAndSortingRepository<User, Long> {
}
