package com.arcus.javatrainings.java8features.mytest;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> b = (i, j) -> i % j == 0;

		System.out.println(b.test(20, 2));
		System.out.println(b.test(20, 3));

	}

}
