package com.arcus.javatraining.array;

import java.util.Scanner;

public class ForeachExample {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] myIntArray = { 1, 2, 3, 4, 5 };
		char[] myCharArray = { 'A', 'p', 'p', 'l', 'e' };

		System.out.println("Enter the length ");
		int value = sc.nextInt(); // taking value or length

		// Declaring and creating String array
		String[] arr = new String[value];

		Scanner sc1 = new Scanner(System.in);

		// initializing value to the array
		System.out.println("******Initializing array******");
		System.out.println("Enter " + arr.length + " string values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc1.nextLine();
		} // using the for loop to initializing array

		// displaying the array elements
		System.out.println("\n******Display array elements with normal for loop******");
		System.out.println("Entered Strings are");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}

		System.out.println("\n******Display array elements with enhanced for loop******");
		System.out.println("Entered Strings are");
		for (String stringElement : arr) {
			System.out.println("String Element: " + stringElement);
		}

	}
}
