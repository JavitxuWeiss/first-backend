package com.backend.firstbackend.resources;

import com.backend.firstbackend.domain.User;
import com.backend.firstbackend.domain.UserDTO;
import com.backend.firstbackend.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class testController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/users")
    public ResponseEntity<Iterable<UserDTO>> getUsers() {
        return ResponseEntity.ok(userService.getAll());
    }
}
