package com.arcus.javatraining.accessmodifiers;

public class ClassModifierExample2 {

	public void printMessage() {
		System.out.println("Hello World!!");
	}

	private void privateMethod() {
		System.out.println("Hello World!!");
	}

	void defaultMethod() {
		System.out.println("Hello World!!");
	}

	protected void protectedMethod() {
		System.out.println("Hello World!!");
	}

	public static void main(String args[]) {

		ClassModifierExample2 c2 = new ClassModifierExample2();
		c2.printMessage();
		c2.privateMethod();
		c2.defaultMethod();
		c2.protectedMethod();
	}

}
