package com.example.CrudHexagonal.domain.valueObject;

public class UserLastNameValue {

    private final String value;

    public UserLastNameValue(String value) {
        if(value.length() < 3){
            throw new IllegalArgumentException("El lastName debe tener mas de 3 caracteres");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
