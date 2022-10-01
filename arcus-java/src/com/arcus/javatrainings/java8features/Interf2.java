package com.arcus.javatrainings.java8features;

@FunctionalInterface
public interface Interf2 {
	
	
	//SAM - Single Abstract Method
	
	public void m1();
	
	default void m2(){
		System.out.println("Hello from default method");
		
	}
	
	public static void m3() {
		System.out.println("Hello from static method");
	}

}
