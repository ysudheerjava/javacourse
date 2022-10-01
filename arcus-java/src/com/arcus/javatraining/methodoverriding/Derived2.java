package com.arcus.javatraining.methodoverriding;

public class Derived2 extends Derived1 {

	/*
	 * public void displayText() { System.out.println("Base class2 method.."); }
	 */

	public static void main(String[] args) {

		Derived2 derived2 = new Derived2();

		System.out.println(derived2.cName);
		System.out.println(derived2.firstNum);
		System.out.println(derived2.secondNum);
		
		
		derived2.displayText();

	}

}
