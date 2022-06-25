/**
 * 
 */
package com.arcus.javatraining.overloading.methodoverloading;

public class OverloadingExample {

	// OverloadingExample default constructor

	OverloadingExample() {

		System.out.println("Creating an instance from constructor");
	}

	// Constructor with an argument
	OverloadingExample(String name) {

		System.out.println("Printing name from constructor" + name);
	}

	// Constructor with an argument
	OverloadingExample(int i) {

		System.out.println("Printing value from constructor with int arg" + i);
	}

	public void doCalculateSum(int firstNumber, int secondNumber) {

		int sum = firstNumber + secondNumber;
		System.out.println("Sum of two numbers: " + sum);
	}

	public void doCalculateSum(int firstNumber, int secondNumber, int thirdNumber) {

		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.println("Sum of three numbers: " + sum);
	}

	public void doCalculateSum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

		int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
		System.out.println("Sum of four numbers: " + sum);
	}

	public void doCalculateSum() {

		System.out.println("Overloaded function with out args");

	}

	public static void main(String[] args) {

		OverloadingExample overloadex1 = new OverloadingExample();
		OverloadingExample overloadex2 = new OverloadingExample("Arcus info");
		OverloadingExample overloadex3 = new OverloadingExample(3);

		overloadex1.doCalculateSum();
		overloadex1.doCalculateSum(10, 20);
		overloadex1.doCalculateSum(10, 20, 30);
		overloadex1.doCalculateSum(10, 20, 30, 40);

	}

}
