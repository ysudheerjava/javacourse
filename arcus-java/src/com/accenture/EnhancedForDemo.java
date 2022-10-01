package com.accenture;

import java.util.Scanner;

public class EnhancedForDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements you want to store: ");

		int arrlen = sc.nextInt();
		int arr[] = new int[arrlen];

		System.out.println("Length of Array: " + arr.length);//

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter element " + i);//
			arr[i] = sc.nextInt();
		}

		System.out.println("Using enhanced for Loop");
		// enhanced for loop
		for (int s : arr) {
			System.out.println(s);
		}

	}

}
