package com.arcus.javatraining.exceptions.customexceptions;

import java.util.Scanner;

class CustomizedExceptionDemo {
	
	public static void main(String[] args) {

		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter age to join: ");

			int age = Integer.parseInt(myObj.nextLine()); // Read user input
//int age=Integer.parseInt(args[0]);
			
			if (age > 60) {
				throw new OverAgeException("Your age exceeded, you are not eligible for recruitment process");
			} else if (age < 18) {
				throw new UnderAgeException("You are under aged, you are not eligible for recruitment process");

			} else {
				System.out.println("Details sent soon by e-mail");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
