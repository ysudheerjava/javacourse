package com.arcus.javatraining.array;

class MultidimensionalArray {
	public static void main(String[] args) {

		// create a 2d array
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };

		// calculate the length of each row
		System.out.println("Length of row 1: " + a[0].length);
		System.out.println("Length of row 2: " + a[1].length);
		System.out.println("Length of row 3: " + a[2].length);

		System.out.println();
		System.out.println();

		int[][] a1 = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

		System.out.println("Length of an Array: " + a1.length);

		for (int i = 0; i < a1.length; ++i) {
			for (int j = 0; j < a1[i].length; ++j) {
				System.out.println("a[" + i + "][" + j + "]: " + a1[i][j]);
			}
		}

		System.out.println();
		System.out.println("Using enhanced for loop: ");
		System.out.println();

	}
}