package com.arcus.javatrainings.java8features.predicates.training;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String args[]) {
		
		Predicate<Integer> p = i-> (i>100);
		System.out.println(p.test(110));
		
		Predicate<String> s= str->str.length()>4;
		System.out.println(s.test("Arcus"));
		System.out.println(s.test("USA"));
		
	}
	
	

}
