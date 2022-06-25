package com.arcus.javatraining.abstractclasses;

public class Laptop extends Computer {

	public void process() {

		System.out.println("Laptop processing logic");

	}

	public void display() {

		System.out.println("Laptop display logic");
	}

	public static void main(String args[]) {

		Laptop lap = new Laptop();
		
		
		lap.process();
//		lap.display();
		
		lap.generalFeatures();

	}

}
