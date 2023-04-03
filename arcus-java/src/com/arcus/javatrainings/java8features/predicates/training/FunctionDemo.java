package com.arcus.javatrainings.java8features.predicates.training;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Employee,String> f = s ->{
			int salary = s.salary;
			String band="";
			
			if (salary >=50000) 
				band = "A";
			
			else if (salary >=30000 && salary <49000)
				band="B";
			
			else if(salary >= 10000 && salary <=29000)
				band="C";
			
			else 
				band="Not defined";
			
			return band;
		};
		

		
		Employee[] empArray = {new Employee("Prajeeth",10000),new Employee("Praneeth",60000),new Employee("Prakash",3000),new Employee("Peter",300000)};
		
		for (Employee emp :empArray ) {
			System.out.println("Employee name: " + emp.name);
			System.out.println("Employee Salary: " + emp.salary);
			System.out.println("Employee Band: " + f.apply(emp));
			System.out.println();	
		
		}
		
		
	}

}
