package com.arcus.practice;
// The below code would not work in JDK 1.7
class staticExample {

	// static block execution without main method in JDK 1.6.
	static
	{
		System.out.println("Inside Static Block.");
		System.exit(0);
	}
	

}
