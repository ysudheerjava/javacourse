package com.arcus.javatraining.array;

public class ArrayExample1 {
	public static void main(String args[]) {
		// int[10]; //invalid declaration

		int[] a; // valid declaration

		int[] ab = new int[10];

		// two dimensional array definition

		int[][] intArray = { { 1, 2 }, { 4, 8 } };

		int[][] doubleDim = new int[2][2];

		doubleDim[0][1] = 1;

		// Access individual element of array
		int val = intArray[0][1];
		// print the element
		System.out.println("Accessed array value = " + val);
		System.out.println("Contents of Array:");
		// print individual elements of array
		System.out.println(intArray[0][0] + " " + intArray[0][1]);
		System.out.println(intArray[1][0] + " " + intArray[1][1]);

		// initialize 2-d array
		int[][] myArray = { { 1, 2, 3 }, { 4, 5 } };
		System.out.println("length of array:" + myArray.length); // number of rows
		for (int i1 = 0; i1 < myArray.length; i1++)
			// length of each row
			System.out.println("length of 1D array(" + (i1 + 1) + "):" + myArray[i1].length);

	}

}
