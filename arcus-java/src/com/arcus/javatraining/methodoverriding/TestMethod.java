package com.arcus.javatraining.methodoverriding;

public class TestMethod {
	public static void main(String args[]) {
// BaseClass reference and object
		BaseClass obj1 = new BaseClass();
// BaseClass reference but DerivedClass object 
		BaseClass obj2 = new DerivedClass();
		
		DerivedClass obj3 = new DerivedClass();
		
// Calls the method from BaseClass class 
		obj1.methodToOverride();
		obj1.methodToOverride();
//Calls the method from DerivedClass class 
		obj2.methodToOverride();
		obj2.methodToOverride2();
		obj3.methodToOverride();
		obj3.methodToOverride2();
	}
}
