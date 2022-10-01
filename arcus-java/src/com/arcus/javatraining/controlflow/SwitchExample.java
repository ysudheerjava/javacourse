package com.arcus.javatraining.controlflow;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String args[]) {
		// char grade = args[0].charAt(0);

		char choice = 's';

		switch (choice) {

		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Fair");
			break;
		case 'E':
			System.out.println("Poor");
			break;

		default:
			System.out.println("Invalid grade");
			break;
		}

		System.out.println("Your choice is " + choice);
	}
}
