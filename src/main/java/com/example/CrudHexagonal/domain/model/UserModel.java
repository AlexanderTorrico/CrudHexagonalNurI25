package com.example.CrudHexagonal.domain.model;

import com.example.CrudHexagonal.domain.valueObject.UserEmailValue;
import com.example.CrudHexagonal.domain.valueObject.UserLastNameValue;
import com.example.CrudHexagonal.domain.valueObject.UserNameValue;
import com.example.CrudHexagonal.domain.valueObject.UserPasswordValue;

public class UserModel {

    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserModel() {
    }

    public UserModel(Long id, String name, String lastName, String address, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public UserModel(UserNameValue name, UserLastNameValue lastName, String address, UserEmailValue email, UserPasswordValue password) {
        this.name = name.getValue();
        this.lastName = lastName.getValue();
        this.address = address;
        this.email = email.getValue();
        this.password = password.getValue();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
