package com.arcus.javatrainings.java8features.predicates;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
	
		Consumer<Employee> c1 = m->System.out.println(m.name+"");
		Consumer<Employee> c2 = m->System.out.println(m.salary+"");
		Consumer<Employee> c3 = m->System.out.println(c1.andThen(c2));
		
		Employee emp = new Employee("Abhinav",30);
		
		c3.accept(emp);
		
		

	}

}
