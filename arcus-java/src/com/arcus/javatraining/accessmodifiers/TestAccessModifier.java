package com.arcus.javatraining.accessmodifiers;

public class TestAccessModifier {
	
	private int x=10;
	int y=30;
	
	
	
	
	 void doSomething() {
		System.out.println("Test");
		final int localint=10;
		//localint=20;
		
		int my7var9;
		
		int NUMBER=20; 
		int NuMbEr=30;
		
		int Boolean=10;
		
		//int if=10; 

		
		
	}
	
	
	public static void main(String args[]) {
		
		TestAccessModifier tm = new TestAccessModifier();
		
		
		System.out.println(tm.y);
		
		
	}

}
