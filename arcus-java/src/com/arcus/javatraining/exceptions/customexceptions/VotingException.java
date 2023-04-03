package com.arcus.javatraining.exceptions.customexceptions;

//Custom exception
public class VotingException extends Exception {

	String message;

	VotingException(String message) {
		// super(message);

		this.message = message;

	}

	// overriding the toString method to display message
	public String toString() {
		return message;
	}

}
