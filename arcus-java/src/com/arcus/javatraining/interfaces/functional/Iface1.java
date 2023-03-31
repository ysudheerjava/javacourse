package com.arcus.javatraining.interfaces.functional;

@FunctionalInterface

interface Iface1 {

	final String myVar = "ArcusInfoTech";

	//public void add(int i, int j);
	
	public String getText(String text);
	
	
	
	default void myMethod() {

		System.out.println("Default Method of interface");
	}

	
	default void myMethod11() {

		System.out.println("Default Method of interface");
	}

	
	public static void myMethod1() {
		System.out.println("Static method of interface");
	}

}
