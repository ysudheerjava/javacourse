package com.arcus.tests;

import java.util.Arrays;
import java.util.List;

public class Scaler {

	public static void main(String[] args) {
		int Arr[] = { 10, 20, 11, 21, 31 };

		System.out.println("Before sort");

		for (int a : Arr) {
			System.out.println(a);
		}

		// int newArr[]=Arrays.sort(Arr);

		Arrays.sort(Arr);

		// System.out.println(Key + " found at index = " + Arrays.binarySearch(Arr,
		// Key));

		System.out.println("After sort");
		for (int a : Arr) {
			System.out.println(a);
		}
		
		 List arrList= Arrays.asList(Arr);
		
		
		 int Key = 31;

			System.out.println(
				Key + " found at index = "
				+ Arrays.binarySearch(Arr, Key));
			
			
			System.out.println("Integer Array is: " + Arrays.toString(Arr));
			System.out.println("Integer Array is: " + arrList);
			System.out.println("Integer Array is: " + arrList.toString());

			
	}

}

/*
 * public static void main(String args[]) { int[] arr = { 5, -2, 23, 7, 87, -42,
 * 509 }; System.out.println("The original array is: "); for (int num : arr) {
 * System.out.print(num + " "); } Arrays.sort(arr);
 * System.out.println("\nThe sorted array is: "); for (int num : arr) {
 * System.out.print(num + " "); } }
 */