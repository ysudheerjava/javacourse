package com.arcus.javatraining.array;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {

		// numbers array
		int numbers[] = new int[] { 55, 32, 100, 45, 98, -1, 82, 11, 9, -39, 5000000 };
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		// assign first element of an array to largest and smallest
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];

			else if (numbers[i] < smallest)

				smallest = numbers[i];
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);
			System.out.println();
		}

		System.out.println(largest);
		System.out.println(smallest);
	}
}