package com.arcus.javatraining.exceptions.customexceptions;

import java.util.Scanner;

class CustomizedExceptionDemo {
	
	public static void main(String[] args) throws OverAgeException  {

		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter age");

			int age = Integer.parseInt(myObj.nextLine()); // Read user input

			if (age > 60) {
				throw new OverAgeException("Age exceeded, not eligible for recruitment process");
			} else if (age < 18) {
				throw new UnderAgeException("Under aged, you are not eligible for recruitment process");

			} else {
				System.out.println("Accepted, Details sent by e-mail");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated ca2tch block
			e.printStackTrace();
		}
	}
}
