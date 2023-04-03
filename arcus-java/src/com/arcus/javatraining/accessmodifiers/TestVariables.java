package com.arcus.javatraining.accessmodifiers;

public class TestVariables {

	int instanceVar1;
	String instanceVar2;

	static int totalMarks = 300;
	static String myString;

	public void addNumbers() {
		int firstNumber = 10;
		int secondNumber = 20;
		int result = firstNumber + secondNumber;
		System.out.println(result);
		System.out.println(totalMarks);
	}

	public int addTwoNumbers() {
		int firstNumber = 10;
		int secondNumber = 20;
		int result = firstNumber + secondNumber;
		return result;
	}

	public static int addTwoNumbersWithArgs(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {

		int x = 20;

		int result1 = addTwoNumbersWithArgs(10, 20);

		TestVariables obj1 = new TestVariables();
		obj1.instanceVar1 = 20;
		obj1.instanceVar2 = "Java";

		TestVariables obj2 = new TestVariables();
		obj2.instanceVar1 = 30;
		obj2.instanceVar2 = "HTML";

		int sum = obj1.addTwoNumbers();
		System.out.println("Sum of two numbers: " + sum);

		int sum1 = obj1.addTwoNumbersWithArgs(100, 200);
		System.out.println("Calling method addTwoNumbersWithArgs: " + sum1);

		System.out.println("Static Variables:::");

		System.out.println(totalMarks);
		System.out.println(myString);

		System.out.println(obj1.totalMarks);
		System.out.println(obj1.myString);

		totalMarks = 400;

		System.out.println(totalMarks);

		totalMarks = 500;

		System.out.println(obj1.totalMarks);//

	}

}
