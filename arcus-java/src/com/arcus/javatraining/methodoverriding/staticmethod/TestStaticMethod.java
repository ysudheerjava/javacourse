package com.arcus.javatraining.methodoverriding.staticmethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		
		System.out.println("Overriding a Static method");
		System.out.println("***************************");
		System.out.println();
		  SuperClass sc = new SuperClass();	  
		  //calling a static method of super class 
		  sc.myMethod1();
		  
		  DerivedClass dc = new DerivedClass(); //calling a static method of derived class 
		  dc.myMethod1();
		  
		  SuperClass sc1 = new DerivedClass(); 
		  sc1.myMethod1();
		 
		
		System.out.println("Overriding a Nonstatic method");
		System.out.println("***************************");
		System.out.println();
		  
		  
		SuperClass sc2 = new SuperClass();
		//calling a non static method of super class
		sc2.myMethod();
		
		DerivedClass dc1 = new DerivedClass();
		//calling a non-static method of Derived Class
		dc1.myMethod();
		
		
		SuperClass sc3 = new DerivedClass();
		sc3.myMethod();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
