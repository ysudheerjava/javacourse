package com.arcus.javatrainings.java8features.mytest;

public class Employee {
	
	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	String name;
	int salary;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}


}
