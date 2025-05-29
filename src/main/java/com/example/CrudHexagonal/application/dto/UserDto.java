package com.example.CrudHexagonal.application.dto;

import lombok.Getter;

@Getter
public class UserDto {

    private String name;
    private String lastName;
    private String email;
    private String address;

    public UserDto(String name, String lastName, String email, String address) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
}
