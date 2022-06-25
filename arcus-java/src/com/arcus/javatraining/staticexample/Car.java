package com.arcus.javatraining.staticexample;

public class Car{
	
	public int myvar;
	
	public static int intNumberofCars;
	
	
	Car(){
		intNumberofCars++;
	}
	
	public static void myStaticMethod() {
		final int i =10;
		int s=10;
		
		System.out.println("In Static method");
		Car car = null;
		car.myvar=10;
	}
	
	public static void main(String args[]) {
		
		Car tesla = new Car();
		Car maruti = new Car();
		
		int no= intNumberofCars;
		
		//myStaticMethod().;
		
	//	System.out.println(no);
		
	}
	
	
	
}