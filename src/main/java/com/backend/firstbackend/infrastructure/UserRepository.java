package com.backend.firstbackend.infrastructure;

import com.backend.firstbackend.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
        List<User> findByEmail(String email);
    }

