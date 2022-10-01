package com.arcus.javatraining.innerclasses.staticnested;

/*Member class - Inner class also known as a regular inner class. 
It can be declared with access modifiers like public, default, private, and protected.*/

public class Outer1 {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		Outer1 obj = new Outer1();
		Outer1.Inner in = obj.new Inner();
		in.msg();
	}
}