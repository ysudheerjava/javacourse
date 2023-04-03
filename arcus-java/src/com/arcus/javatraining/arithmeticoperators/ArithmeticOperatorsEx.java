package com.arcus.javatraining.arithmeticoperators;

public class ArithmeticOperatorsEx {

	public static void main(String args[]) {

		int firstNumber; // variable declaration

		// int firstNumber =10; //variable declaration and initialization in single
		// statement
		int secondNumber;
		int result;

		firstNumber = 10; // variabe initialization
		secondNumber = 20;

		// addition
		result = firstNumber + secondNumber; // 30
		System.out.println("Sum of two numbers: " + result);

		// subtraction
		result = secondNumber - firstNumber;
		System.out.println("Subtraction of two numbers: " + result);

		// division
		result = secondNumber / firstNumber;
		System.out.println("Result of division: " + result);

		// product
		result = firstNumber * secondNumber;
		System.out.println("Product of two numbers: " + result);

		// modulus
		result = 20 % 10;
		System.out.println("Modulus: " + result);

		boolean result1 = firstNumber > secondNumber;
		System.out.println(result1);

		result1 = firstNumber < secondNumber;
		System.out.println(result1);

		result1 = firstNumber == secondNumber;
		System.out.println(result1);

		result1 = firstNumber != secondNumber;
		System.out.println(result1);

		result1 = firstNumber >= secondNumber;
		System.out.println(result1);

		result1 = firstNumber <= secondNumber;
		System.out.println(result1);

		
		//= operator
		
		int a =10;
		int b =5;
		a+=b;// a= a+b;
		
		a*=b; //a=a*b;
		a-=b;//a= a-b
		
		
		
		a%=b; //a=a%b;
		
	//	a/=b; a=a/b; quotient
		System.out.println(a);//a= a+b;
		
		
	}

}
