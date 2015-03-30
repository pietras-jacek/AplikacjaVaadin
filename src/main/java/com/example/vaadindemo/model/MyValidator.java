package com.example.vaadindemo.model;

import com.vaadin.data.Validator;

public class MyValidator implements Validator {

    public MyValidator() {
    }
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void validate(Object value) throws InvalidValueException {
        String valid = String.valueOf(value);
        valid.trim();
        if (!valid.substring(0, 1).matches("^[A-Z]$") || valid.isEmpty()) {
            throw new InvalidValueException("To nie jest duża litera");
        }
    }
}
