package com.arcus.javatraining.methodoverriding.staticmethod;

public class Child extends Parent {
	
	public static void m() {
		System.out.println("Child");
	}
	
	public  void m1() {
		System.out.println("Non static method of Child");
	}

}
