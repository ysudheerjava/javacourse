package com.arcus.javatraining.interfaces;

public class Cat implements Animal{

	
	  public void animalSound() {
		  System.out.println("Meow Meow");
	  
	  }
	  
	
		public void animalColour() {
			System.out.println("White");
			
		}
		
	
		public boolean isReptile() {
			return false;
		}

	
		
	
	public static void main (String args[]) {
		
		Cat cat = new Cat();
		cat.animalSound();
		
	}


	


	
	
	

}
