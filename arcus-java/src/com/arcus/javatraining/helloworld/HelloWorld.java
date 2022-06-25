package com.arcus.javatraining.helloworld;

public class HelloWorld {

	public static void main(String args[]) {

		int mathMarks, scienceMarks, total, average;
		// int scienceMarks;
//	int total;

		mathMarks = 50;
		scienceMarks = 75;

		total = mathMarks + scienceMarks;

		average = total / 2;

		System.out.println("My mathMarks : " + mathMarks);
		System.out.println("My scienceMarks: " + scienceMarks);
		System.out.println("My Total is : " + total);
		System.out.println("My Average is : " + average);

		String myName;

		myName = "Sudheer";

		String firstName = "Y";

		String fullName = firstName + myName;

		System.out.println("My Name is : " + firstName + myName);

	}

}
