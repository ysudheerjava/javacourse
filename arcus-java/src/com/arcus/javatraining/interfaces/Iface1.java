package com.arcus.javatraining.interfaces;

@FunctionalInterface

interface Iface1 {

	final String myVar = "ArcusInfoTech";

	public void add(int i, int j);
	
	

	default void myMethod() {

		System.out.println("Default Method of interface");
	}

	public static void myMethod1() {
		System.out.println("Static method of interface");
	}

}
