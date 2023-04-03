package com.arcus.javatraining.methodoverriding.staticmethod;

public class DerivedClass extends SuperClass {
	
	
	public void myMethod() {
		System.out.println("Non static Method in Derived class");
	}
	
	
	public static void myMethod1() {
		System.out.println(" Static Method in Derived class");
	}
	
	


}
