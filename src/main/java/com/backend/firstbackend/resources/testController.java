package com.backend.firstbackend.resources;

import com.backend.firstbackend.domain.User;
import com.backend.firstbackend.domain.UserDTO;
import com.backend.firstbackend.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/")
public class testController {

    @Autowired
    private UserService userService;


    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("hello world");
    }

    @GetMapping("/hello-paquete")
    public ResponseEntity<String> helloPaquete() {
        return ResponseEntity.ok(userService.getString());
    }

    @GetMapping("/users")
    public ResponseEntity<Iterable<UserDTO>> getUser() {
        return ResponseEntity.ok(userService.getAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.deleteUser(id));
    }
    @PostMapping("/add")
    public ResponseEntity addUser(User newUser) {
        return ResponseEntity.ok(userService.newUser(newUser));
    }
    @PatchMapping("/update")
    public ResponseEntity updateUser(User userUpdated) {
        return ResponseEntity.ok(userService.updateUser(userUpdated));
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<UserDTO>> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));

    }
}
