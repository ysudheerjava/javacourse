package com.arcus.javatrainings.java8features.predicates;

import java.util.function.Function;
import java.util.function.Predicate;

//to implement conditional checksin the programming Predicate can be used,
//Predicate is a functional interface

public class PredicateDemo {
	
	int age;
	int name;

	public static void main(String[] args) {
		
		
		Predicate<Integer> p = i->(i>10) ;
		
		System.out.println(p.test(100));
		
		Predicate<String> s = str->str.length() >3;
		
		System.out.println(s.test("Sudheer"));
		
		
		//another predicate
		Predicate<Integer> pred= j-> j % 2 ==0;
		System.out.println(pred.test(100));
		
	//	Function<String, Integer> f->{};
		
		
		
	}
	
	
	
	

}
