package com.example.CrudHexagonal.domain.services;

import com.example.CrudHexagonal.domain.model.UserModel;
import com.example.CrudHexagonal.domain.valueObject.UserEmailValue;
import com.example.CrudHexagonal.domain.valueObject.UserLastNameValue;
import com.example.CrudHexagonal.domain.valueObject.UserNameValue;
import com.example.CrudHexagonal.domain.valueObject.UserPasswordValue;

public class UserCreateService {

        public UserModel create(UserModel userModel){

        UserNameValue name = new UserNameValue(userModel.getName());
        UserLastNameValue lastName = new UserLastNameValue(userModel.getLastName());
        UserEmailValue email = new UserEmailValue(userModel.getEmail());
        UserPasswordValue password = new UserPasswordValue(userModel.getPassword());

        return new UserModel(
            name, lastName, userModel.getAddress(), email, password
        );
    }
}
