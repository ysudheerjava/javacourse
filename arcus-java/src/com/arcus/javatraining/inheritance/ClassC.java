package com.arcus.javatraining.inheritance;

public class ClassC extends SubClassExample1 {


	public void displayText() {
		System.out.println("Hello from ClassC");
	}
	
	public static void main(String[] args) {

		ClassC classc= new ClassC();
		
		System.out.println(classc.x);
		System.out.println(classc.y);
		
		classc.displayValues();

	}

}
