package com.arcus.javatrainings.java8features.mytest;

import java.util.function.Function;
public class FunctionExample {

	public static void main(String[] args) {

      Function<String, Integer> f = s -> s.length();
      System.out.println(f.apply("ArcusInfotech"));
      
 
	}

}
