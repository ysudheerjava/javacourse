package com.arcus.javatrainings.java8.predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {

	public static void main(String args[]) {

		Function<Employee, String> f = s -> {

			int salary = s.salary;
			String band = "";

			if (salary > 50000) {
				band = "A";

			} else if (salary >= 30000) {
				band = "B";
			} else if (salary >= 10000) {
				band = "C";
			} else
				band = "undefined";

			return band;

		};

		Predicate<Employee> e = s -> s.salary >= 40000;

		Employee[] empList = { new Employee("RAM", 30000), new Employee("SAM", 60000), new Employee("PAM", 400000),
				new Employee("DAM", 10000), new Employee("RKAM", 3000),

		};

		for (Employee emp : empList) {

			if (e.test(emp)) {

				System.out.println("Employee Name " + emp.name);
				System.out.println("Employee salary " + emp.salary);
				System.out.println("Employee Band " + f.apply(emp));
				System.out.println();

			}
		}

	}

}
