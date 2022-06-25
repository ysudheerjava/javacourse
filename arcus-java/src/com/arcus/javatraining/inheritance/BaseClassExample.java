package com.arcus.javatraining.inheritance;

//Super class
public class BaseClassExample {
	
	int i =10;
	int y= 10;
	String name;
	
	
	public int displayNumber(int number) {
		return number;
	}

	
	public void displayString() {
		System.out.println("Arcus Infotech");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClassExample myInstance = new BaseClassExample();
		
		int myNumber = myInstance.displayNumber(50);
		
		System.out.println("My Number "+ myNumber);

	}
	
	
	

}
