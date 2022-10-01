package com.arcus.javatraining.array;

public class ArrayDemo {

	public static void main(String[] args) {

		// initializing array with size 10;
		int[] myArray = new int[4];

		// inserting elements in the array
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;

		System.out.println("First element of array: " + myArray[0]);
		System.out.println("Second element of array: " + myArray[1]);
		System.out.println("Third element of array: " + myArray[2]);
		System.out.println("Fourth element of array: " + myArray[3]);
		
		

		System.out.println();

		System.out.println("Length of my array: " + myArray.length);
		System.out.println();

		System.out.println("Using For Loop:::: ");

		for (int i = 0; i < myArray.length; i++) {

			System.out.println(myArray[i]);
		}

		System.out.println();

		String myStringArray[] = new String[4];

		myStringArray[0] = "Ram";
		myStringArray[1] = "Sam";
		myStringArray[2] = "Ben";
		myStringArray[3] = "Ken";

		System.out.println("First element of array: " + myStringArray[0]);
		System.out.println("Second element of array: " + myStringArray[1]);
		System.out.println("Third element of array: " + myStringArray[2]);
		System.out.println("Fourth element of array: " + myStringArray[3]);
		System.out.println();

		System.out.println("Length of String array: " + myStringArray.length);

		System.out.println();

		System.out.println("Using For Loop for String Array:::: ");

		for (int i = 0; i < myStringArray.length; i++) {

			System.out.println(myStringArray[i]);
		}

	}
}