package com.arcus.javatraining.interfaces;

public class MyInterfaceImpl2 implements MyInterface {

	@Override
	public void displayText() {
		System.out.println("Displaying text from MyInterfaceImpl2");

	}

	@Override
	public void displayNumbers() {
		System.out.println("Displaying numbers:  999999999");
		
	}
	
	
	public static void main(String args[]) {
		
		MyInterfaceImpl2 myInstance = new MyInterfaceImpl2();
		
		myInstance.displayNumbers();
		myInstance.displayText();
		
		
	}
	
	
	
	


}
