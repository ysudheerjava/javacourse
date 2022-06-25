package com.arcus.javatraining.helloworld;

public class HelloJava {

	HelloJava() {
	}

	public void doAdd() {
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
	}

	public int doSubtract() {
		int i = 10;
		int j = 20;
		int sub = i - j;
		return sub;

	}

	public void displayText() {
		System.out.println("Hello World !!");
	}

	public static void main(String args[]) {

		HelloJava hello = new HelloJava();
		hello.doAdd();
		hello.displayText();
		
		int subtractedValue = hello.doSubtract();
		
		
	}

}
