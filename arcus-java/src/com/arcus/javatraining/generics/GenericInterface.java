package com.arcus.javatraining.generics;

public interface GenericInterface {
	
	
	/*
	 * public int add(int a, int b);
	 * 
	 * public double add(double a, double b);
	 * 
	 * public float add(float a, float b);
	 */
	public <T> T add(T a, T b); //T can be substituted to any type in your implementation
	
	

	
	
	
	
	

}
