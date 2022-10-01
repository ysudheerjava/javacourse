package com.arcus.javatraining.methodoverriding;

import java.util.LinkedList;

public class Derived1 extends SuperExample{
	
	
	  public void displayText() {
	  
	  System.out.println("Derived1 method"); 
	  }
	 

	public static void main(String[] args) {
		
		Derived1 derived1 = new Derived1();
		
		System.out.println(derived1.cName);
		System.out.println(derived1.firstNum);
		System.out.println(derived1.secondNum);
		
		derived1.displayText();
		
		
		

	}

}
