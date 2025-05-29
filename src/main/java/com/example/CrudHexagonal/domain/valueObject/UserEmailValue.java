package com.example.CrudHexagonal.domain.valueObject;

public class UserEmailValue {

    private final String value;

    public UserEmailValue(String value) {

        if (!value.matches(".*[@.].*")) {
            throw new IllegalArgumentException("El email debe contener al menos un carácter especial '@' o '.'");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!value.matches(emailRegex)) {
            throw new IllegalArgumentException("El formato del email es inválido.");
        }

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
