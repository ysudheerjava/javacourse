package com.arcus.javatraining.array;

import java.util.Scanner;

public class DDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] dd = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dd[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(dd[i][j] + " ");
			}
			System.out.println();
		}

	}

}
