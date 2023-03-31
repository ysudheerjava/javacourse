package com.arcus.javatraining.exceptionhandling;

public class ExceptionDemo {

	public void doStuff() {
		doMoreStuff();
	}

	public void doMoreStuff() {
		try {
		doMuchMoreStuff();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void doMuchMoreStuff() {

		int a = 10;
		int b = 0;
		System.out.println(a / b);//arithmetic exception
		System.out.println("Done doing stuff");
	}

	public static void main(String args[]) {

		ExceptionDemo d = new ExceptionDemo();
		d.doStuff();

	}

}
