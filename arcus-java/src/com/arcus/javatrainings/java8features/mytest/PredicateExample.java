package com.arcus.javatrainings.java8features.mytest;

import java.util.function.Predicate;

//Predicate to check the number if it is greater than 10.
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i->(i>10);
		
		
		//test
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		Predicate<String> s = str->str.length()>5;
		System.out.println(s.test("Arcus"));
		System.out.println(s.test("Infotech"));
		System.out.println(s.test("Ameerpet"));
		
		

	}

}
