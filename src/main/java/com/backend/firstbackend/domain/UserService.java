package com.backend.firstbackend.domain;

import com.backend.firstbackend.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAll() {
        List<User> users = (List<User>) userRepository.findAll();

        return users
                .stream()
                .map(User::toDTO)
                .collect(Collectors.toList());
    }
}
