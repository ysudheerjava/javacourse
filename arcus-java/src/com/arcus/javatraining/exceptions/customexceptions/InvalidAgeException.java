package com.arcus.javatraining.exceptions.customexceptions;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		// calling the constructor of parent Exception
		super(str);
	}
}


//try with RuntimeException and checked exception Exception