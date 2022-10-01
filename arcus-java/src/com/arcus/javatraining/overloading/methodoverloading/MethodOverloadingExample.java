package com.arcus.javatraining.overloading.methodoverloading;

public class MethodOverloadingExample {

	public void doSomething() {
		int first = 10;
		int second = 20;

	}

	public void addNumbers() {
		int first = 10;
		int second = 20;
		System.out.println(first + second);
	}

	public int addNumbers(int x, int y) {
		return x + y;

	}

	public int addNumbers(int x, int y, int z) {
		return x + y + z;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingExample mle = new MethodOverloadingExample();

		int sum = mle.addNumbers(10, 20);

		int sum2 = mle.addNumbers(10, 20, 30);

		System.out.println("The sum1 is: " + sum);
		System.out.println("The sum2 is: " + sum2);
		
		mle.addNumbers();

	}

}
