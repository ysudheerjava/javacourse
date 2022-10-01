package com.arcus.javatraining.interfaces.automobile;

public interface Car extends Automobile {

	public String name = "XYX";

	public String getModelName();

	public int getMileage();

	public int getManufacturingYear();
	
	//public int getManufacturingYear1();

	// java 8 features of interface

	default void myDefaultMethod() {

		System.out.println("Default Method call");

	}

	static void myStaticMethod() {

		System.out.println("Static method call");

	}

}
