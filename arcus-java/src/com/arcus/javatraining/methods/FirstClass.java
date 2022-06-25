package com.arcus.javatraining.methods;

public class FirstClass {

	FirstClass() {

	}

	public static void main(String args[]) {

		FirstClass myClass = new FirstClass();

		myClass.myMethod2();
		myClass.myMethod3();
	}

	public void myMethod1() {
		System.out.println("Method 1 ");
	}

	public void myMethod2() {
		System.out.println("Method 2 ");
	}

	public void myMethod3() {
		System.out.println("Method 3 ");
	}

} // end of the class
