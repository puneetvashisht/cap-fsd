package com.capgemini.day6;
// Checked exceptions use Exception superclass
public class WrongInputException extends Exception{

	public WrongInputException() {
		super();
	}

	public WrongInputException(String message) {
		super(message);
	}
	
	

}
