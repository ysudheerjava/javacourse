package com.arcus.javatraining.interfaces;

public class Cat implements Animal{

	
	  public void animalSound() {
		  System.out.println("Meow Meow");
	  
	  }
	 
	
	public static void main (String args[]) {
		
		Cat cat = new Cat();
		cat.animalSound();
		
	}

	
	

}
