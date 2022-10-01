package com.arcus.javatrainings.java8features.predicates;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionChainingDemo {

	public static void main(String args[]) {

		Function<Integer,Integer> firstFunction = i -> 2*i;
		Function<Integer,Integer> secondFunction = i->i*i;
		
		System.out.println(firstFunction.andThen(secondFunction).apply(2));
		System.out.println(firstFunction.compose(secondFunction).apply(2));
		
		}
	

}
