package com.arcus.javatraining.accessmodifiers.anotherpackage;

public class MyFirstProgram {

	int total = 200; // instance variable
	static int myTotal = 1000; // static variable belongs to a class

	public void doSomething() {
		int total = 100; // local variable
	}

	public static void main(String[] args) {

		int total = 300;
		// System.out.println(total); //300

		MyFirstProgram mfp = new MyFirstProgram();

		System.out.println(mfp.myTotal);

		mfp.total = 400;
		//System.out.println(mfp.total); // 400

		MyFirstProgram.myTotal = 2000;
		
		
		System.out.println(mfp.myTotal);

		MyFirstProgram mfp1 = new MyFirstProgram();
		// mfp1.total=700;
		//System.out.println(mfp1.total); // 200

		System.out.println(mfp1.myTotal); // 1000

	}

}
