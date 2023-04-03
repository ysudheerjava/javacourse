package com.arcus.javatraining.superthisexample;

public class Childclass extends Superclass {
	
	String s ="Child";
	
	public void m1() {
		
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		
	}

	public static void main(String[] args) {
		Childclass c = new Childclass();
		
		c.m1();

		
	
	}

}
