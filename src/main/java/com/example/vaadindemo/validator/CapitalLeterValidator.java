package com.example.vaadindemo.validator;

import com.vaadin.data.Validator;

public class CapitalLeterValidator implements Validator {

    public CapitalLeterValidator() {
    }

    private static final long serialVersionUID = 1L;

   private String errorMessage = "Błędna wartość.";

	public CapitalLeterValidator(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void validate(Object value) throws InvalidValueException {
		
		if (!isValid(value))
			throw new InvalidValueException(errorMessage + " Nazwa musi zaczynać się z dużej litery");
	}

	public boolean isValid(Object value) {
		
		String firstLetter = ((String) value).substring(0, 1);
		String copy = firstLetter;			
		
		if(copy.toUpperCase().equals(firstLetter)){
			return true;
		}
		
		return false;
	}	
}
