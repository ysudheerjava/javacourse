package com.arcus.javatraining.exceptionhandling;

public class TestThrow1 {
	// function to check if person is eligible to vote or not
	public static void validate(int age) throws Exception {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new Exception("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	// main method
	public static void main(String args[]) throws Exception {
		// calling the function
		validate(20);
		System.out.println("rest of the code...");
	}
}