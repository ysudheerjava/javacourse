package com.arcus.javatrainings.java8.predicate;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("World");

		Consumer<Employee> c1 = e -> {
			System.out.println(e.name);
			System.out.println(e.salary);
		};

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("S", 100));
		empList.add(new Employee("y", 100));

		for (Employee e : empList) {
			c1.accept(e);
		}

	}

}