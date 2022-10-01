package com.arcus.javatrainings.java8.predicate;

import java.util.function.Function;

//Program which takes a number as input and returns the square of the number
public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i->i*i;
		
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		
		Function<String,Integer> h= s->s.length();
		System.out.println(h.apply("ArcusInfotech"));
		
		Function<String,String> ih= s->s.toUpperCase();
		System.out.println(ih.apply("arcusInfotech"));
		
		
	

	}

}
