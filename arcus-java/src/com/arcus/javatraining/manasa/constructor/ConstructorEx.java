package com.arcus.javatraining.manasa.constructor;

import java.util.ArrayList;

public class ConstructorEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		//al.add("Suman");

		
		Employee emp0= new Employee();
		Employee emp1 = new Employee(100, "Raj");

		Employee emp2 = new Employee(200, "Sam");

		Employee emp3 = new Employee(300, "Lokesh", 33);

		/*
		 * emp1.id = 100; emp1.name = "Ram";
		 */
		
		emp0.displayDetails();
		
		emp1.displayDetails();

		/*
		 * emp2.id = 200; emp2.name = "Lakshman";
		 */
		emp2.displayDetails();

		emp3.displayDetails();
		
		System.out.println(emp1.getSum(10,20));
		System.out.println(emp1.getSum(10,20,30));
		System.out.println(emp1.getSum(10,20,40,88));
		
		

	}

}
