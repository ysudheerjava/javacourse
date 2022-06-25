package com.arcus.javatraining.methodoverriding;

public class DerivedClass extends BaseClass {

	/*
	 * public void methodToOverride() { // Derived Class method {
	 * System.out.println("I'm the method of DerivedClass"); }
	 */
	
	public void methodToOverride() {
		
		System.out.println("Childclass method");
		
	}
	
	
	
	public static void main(String args[]) {
		
		DerivedClass dc = new DerivedClass();
		
		dc.methodToOverride();
		dc.methodToOverride2();
	}
	
	
	
}
