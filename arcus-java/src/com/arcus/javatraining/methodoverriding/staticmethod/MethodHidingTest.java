package com.arcus.javatraining.methodoverriding.staticmethod;

public class MethodHidingTest {

	public static void main(String[] args) {

		System.out.println("**********Static methods - Method Hiding********");
		// Method resolution is always takes care by compiler based on reference type.
		// Method hiding - static methods
		Parent p = new Parent();
		p.m();

		Child c = new Child();
		c.m();

		Parent pc = new Child();
		pc.m();

		// Method overriding - non static methods
		System.out.println("**********Non Static methods - Method Overriding********");
		// Method resolution is always takes care by JVM based on runtime object.
		Parent p1 = new Parent();
		p1.m1();

		Child c1 = new Child();
		c1.m1();

		Parent pc1 = new Child();
		pc1.m1();

	}

}
