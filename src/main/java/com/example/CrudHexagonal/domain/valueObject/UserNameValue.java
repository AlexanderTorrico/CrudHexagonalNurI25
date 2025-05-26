package com.example.CrudHexagonal.domain.valueObject;

public class UserNameValue {

    private final String value;

    public UserNameValue(String value) {
        if(value.length() < 3){
            throw new IllegalArgumentException("El nombre debe tener mas de 3 caracteres");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
