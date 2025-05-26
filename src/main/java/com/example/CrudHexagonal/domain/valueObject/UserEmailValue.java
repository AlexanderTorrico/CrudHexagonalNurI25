package com.example.CrudHexagonal.domain.valueObject;

public class UserEmailValue {

    private final String value;

    public UserEmailValue(String value) {
        if(value.length() < 8)
        {
            throw new IllegalArgumentException("El email debe tener mas de 8 caracteres");
        }
        if (!value.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos una letra mayúscula.");
        }
        if (!value.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos una letra minúscula.");
        }
        if (!value.matches(".*[0-9].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un dígito.");
        }
        if (!value.matches(".*[@#$%^&+=!].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un carácter especial (@#$%^&+=!).");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
