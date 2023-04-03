package com.arcus.javatraining.innerclasses.nonstaticnested;

/*Member class - Inner class also known as a regular inner class. 
It can be declared with access modifiers like public, default, private, and protected.*/

public class NonstaticNestedEx {
	
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		NonstaticNestedEx obj = new NonstaticNestedEx();
		NonstaticNestedEx.Inner in = obj.new Inner();
		in.msg();
		
	}
}