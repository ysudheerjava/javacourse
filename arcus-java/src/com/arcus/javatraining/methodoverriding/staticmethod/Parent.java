package com.arcus.javatraining.methodoverriding.staticmethod;

public class Parent {
	public static void m() {
		System.out.println("Parent");
	}
	
	public  void m1() {
		System.out.println("Non static method of Parent");
	}
}
