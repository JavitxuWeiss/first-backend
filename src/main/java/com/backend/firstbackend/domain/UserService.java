package com.backend.firstbackend.domain;

import com.backend.firstbackend.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getString(){
        return("hola petardo");
    }

    public List<UserDTO> getAll() {
        List<User> users = (List<User>) userRepository.findAll();

        return users
                .stream()
                .map(User::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<UserDTO>  findById(Long id) {
        Optional<User> usuario = userRepository.findById(id);
        return usuario
                .map(User::toDTO);
    }
    public User newUser(User nuevoUser) {
        if (nuevoUser != null) {
            return userRepository.save(nuevoUser);
        }
        return new User();
    }

    public boolean deleteUser(Long id){
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public boolean updateUser(User userUpdated) {
        Long num = userUpdated.getId();
        if (userRepository.findById(num).isPresent()) {
            User usertoUpdate = new User();
            usertoUpdate.setId(userUpdated.getId());
            usertoUpdate.setName(userUpdated.getName());
            usertoUpdate.setEmail(userUpdated.getEmail());
            userRepository.save(userUpdated);
            return true;
        }
        return false;
    }
/*    public String updateUserName(Long id, String newName) {
        return newName;
    }
    public String updateUserEmail(Long id, String newEmail) {
        return newEmail;
    }*/

}
