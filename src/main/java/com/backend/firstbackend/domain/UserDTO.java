package com.backend.firstbackend.domain;

public class UserDTO {

    public long id;
    public String name;
    public String email;

    public UserDTO(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
