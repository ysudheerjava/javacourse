package com.arcus.javatrainings.java8features.predicates;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {

	public static void main(String args[]) {

		Function<Employee, String> f = s -> {
			int salary = s.salary;
			String band = "";
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
		
		Predicate<Employee> e= s->s.salary>=40000;
		Consumer<Employee> c= s1->{
			System.out.println("Employee name: " + s1.name);
			System.out.println("Employee Salary: " + s1.salary);
			System.out.println("Employee Band: " + f.apply(s1));
			System.out.println();
			
		};

		Employee[] empArray = { new Employee("Pam", 330000),new Employee("Sam", 60000), new Employee("Ram", 10000), new Employee("Sam", 40000),
				new Employee("Bam", 5000), };

		for (Employee emp : empArray) {
       
			c.accept(emp);
			/*
			 * if(e.test(emp)) { System.out.println("Employee name: " + emp.name);
			 * System.out.println("Employee Salary: " + emp.salary);
			 * System.out.println("Employee Band: " + f.apply(emp)); System.out.println(); }
			 */

		}
	}

}
