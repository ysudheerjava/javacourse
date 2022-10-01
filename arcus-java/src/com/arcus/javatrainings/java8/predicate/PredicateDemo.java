package com.arcus.javatrainings.java8.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> (i > 10);

		System.out.println(p.test(20));
		System.out.println(p.test(9));

		Predicate<String> s = str -> str.length() > 3;
		System.out.println(s.test("Arcus"));
		System.out.println(s.test("RAM"));

	}

}
