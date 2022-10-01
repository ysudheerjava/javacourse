package com.arcus.javatraining.inheritance;

public class SubClassExample1 extends SuperclassExample {
	
	public void displayValues() {
		System.out.println("Displaying sub class variable x: " + x);
		System.out.println("Displaying sub class variable y: " + y);
	}

	public static void main(String args[]) {

		
		SubClassExample1 sc = new SubClassExample1();
		
       System.out.println(sc.x); //10
       System.out.println(sc.y); 	//20
       
       sc.displayValues();
       
	}

}
