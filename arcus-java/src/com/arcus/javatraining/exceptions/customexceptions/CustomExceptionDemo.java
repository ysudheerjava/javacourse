package com.arcus.javatraining.exceptions.customexceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) throws OverAgeException {

		int age = 100;
		if (age > 50)
			throw new OverAgeException("Over age alert");

	}

}
