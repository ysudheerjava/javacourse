package com.arcus.javatraining.variables;

public class VariablesExample {

	int instanceVar = 10; // instance variable

	static int total = 10;

	static {
		System.out.println("Static block initialized.");
		total = 500;
	}
	
	
	//Instance initializer block
	{
		System.out.println("Initializer block");
	}

	VariablesExample() {
		System.out.println("Constructor call");
	}

	public void myMethod() {
		String name;
		name = "Ram";
		System.out.println(name);
	};

	public static void myStaticMethod() {
		total = 20;
		System.out.println("Static Method call");
	}

	public static void myStaticMethod1() {
		total = 20;
		System.out.println("Static Method call");
		myStaticMethod();
	}

	public static void main(String[] args) {

		/*
		 * myStaticMethod();
		 * 
		 * 
		 * VariablesExample firstInstance = new VariablesExample();
		 * firstInstance.instanceVar = 40;
		 * 
		 * VariablesExample.total = 20;
		 * 
		 * VariablesExample secondInstance = new VariablesExample();
		 * secondInstance.instanceVar = 50;
		 * 
		 * System.out.println(firstInstance.instanceVar);// 40
		 * System.out.println(secondInstance.instanceVar);// 10
		 * 
		 * System.out.println(total); // 20 System.out.println(total); // 10
		 * 
		 * //instance method call firstInstance.myMethod();
		 * 
		 * //static method call myStaticMethod(); VariablesExample.myStaticMethod();
		 */

		VariablesExample firstInstance = new VariablesExample();

	}

}
