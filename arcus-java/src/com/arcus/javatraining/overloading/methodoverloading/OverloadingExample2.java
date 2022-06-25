package com.arcus.javatraining.overloading.methodoverloading;

public class OverloadingExample2 {

	
	public void displayText() {
		System.out.println("Hello");
	}
	
	
	public void displayText(String myText) {
			System.out.println(myText);
	}
	
	public void displayText(String myText, String myName) {
		System.out.println(myText+myName);
   }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingExample2 ol = new OverloadingExample2();
		
		ol.displayText("Hi"," Sudheer");

	}

}
