package com.arcus.javatraining.accessmodifiers;

public class ClassModifierExample {
	
	 final int m = 0;
	 
	
	public static void main(String args[]) {
		
		ClassModifierExample2 c2 = new ClassModifierExample2();
		c2.printMessage();
		
	//	c2.privateMethod();
		
		c2.defaultMethod();
		c2.protectedMethod();

	}
	
	
}
