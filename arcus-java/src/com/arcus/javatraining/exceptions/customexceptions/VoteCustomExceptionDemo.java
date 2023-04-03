package com.arcus.javatraining.exceptions.customexceptions;

public class VoteCustomExceptionDemo {

	public static void validateVotersAge(int age) throws VotingException {

		if (age < 18) {
			/*
			 * Syntax for throw: throw instanceof Throwable
			 */
			throw new VotingException("Age under 18 not allowed to vote");

		}
		else {
			System.out.println("Welcome to Vote ");
		}
		

	}

	public static void main(String[] args) {


		try {
			validateVotersAge(17);
		}catch(VotingException v) {
			System.out.println("Caught the exception");
		// printing the message from InvalidAgeException object
			System.out.println("Exception occured: " + v);
			//v.printStackTrace();
		}
		

	}

}
