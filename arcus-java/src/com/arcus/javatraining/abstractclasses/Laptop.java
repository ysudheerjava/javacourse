package com.arcus.javatraining.abstractclasses;

public class Laptop extends Computer {

	public void process() {

		System.out.println("Laptop processing logic");

	}

	public void display() {

		System.out.println("Laptop display logic");
	}

	public void generalFeatures() {
		System.out.println("Overriding generation features  of a computer: ");
		System.out.println("Lappy Hard disk");
		System.out.println("Lappy RAM");
		System.out.println("Lappy Monitor");

	}



	public static void main(String args[]) {

		Laptop lap = new Laptop();
		
		Computer comp = new Laptop();

		lap.process();
		lap.display();

		lap.generalFeatures();

	}

}
