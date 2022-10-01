package com.arcus.javatrainings.java8features.predicates;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String args[]) {

		Function<Integer, Integer> f = i -> i * i;

		System.out.println(f.apply(3));

		System.out.println(f.apply(3));

//for eg. i want to accept input as string and output as int

		Function<String, Integer> g = s -> s.length();
		System.out.println(g.apply("Sudheer"));

		Function<String, String> h = s -> s.toUpperCase();
		System.out.println(g.apply("Sudheer"));

	}

}