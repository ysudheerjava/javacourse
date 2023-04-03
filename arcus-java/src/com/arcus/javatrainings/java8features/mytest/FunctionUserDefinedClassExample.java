package com.arcus.javatrainings.java8features.mytest;

import java.util.function.Function;

public class FunctionUserDefinedClassExample {

	public static void main(String[] args) {

		Function<Employee, String> f = s -> {

			String band = "";
			int salary = s.salary;

			if (salary >= 50000)
				band = "A";

			else if (salary >= 30000)
				band = "B";

			else if (salary >= 10000)
				band = "C";

			else
				band = "undefined";

			return band;

		};

		Employee[] empArray = { new Employee("Ram", 600000), new Employee("Lakshman", 40000),
				new Employee("Raj", 20000), new Employee("Kumar", 5000) };

		for (Employee emp : empArray) {

			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println();

		}

	}

}
