package com.arcus.javatraining.array;

import java.util.Scanner;

public class MutiDimArray2 {

	public static void main(String[] args) {

		int rows = 2;
		int cols = 2;

		int[][] dd = new int[rows][cols];

		/* Inserting elements into the integer array */
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dd[i][j] = j + 1;
			}
		}

		/* retrieving the elements from the multidimensional array */

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(dd[i][j] + " ");

			}
			System.out.println();
		}

	}

}
