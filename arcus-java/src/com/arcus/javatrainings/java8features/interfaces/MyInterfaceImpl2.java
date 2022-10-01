package com.arcus.javatrainings.java8features.interfaces;

public class MyInterfaceImpl2 {

	public static void main(String[] args) {
		/*
		 * MyInterface m = new MyInterface() {
		 * 
		 * public void show() { System.out.println("Hello !!!");
		 * 
		 * }
		 * 
		 * };
		 * 
		 * m.show();
		 */

		MyInterface m;

		m = (a, b) -> System.out.println("Hello! from Lambda! " + "value of a: " + a + " value of b: " + b);

		m.show(10, 20);

	}

}
