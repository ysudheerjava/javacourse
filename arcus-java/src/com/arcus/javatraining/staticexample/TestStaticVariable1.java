package com.arcus.javatraining.staticexample;

//Java Program to demonstrate the use of static variable  

//Test class to show the values of objects  
public class TestStaticVariable1 {

	public static void main(String args[]) {
		Employee employee1 = new Employee(111, "Sunil Kumar");
		Employee employee2 = new Employee(222, "Prabhu kumar");
		// we can change the org of all objects by the single line of code
		// Employee.org="Google";
		employee1.display();
		employee2.display();
	}
}