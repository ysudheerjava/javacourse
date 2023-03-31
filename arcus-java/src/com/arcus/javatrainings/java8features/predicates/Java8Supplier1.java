package com.arcus.javatrainings.java8features.predicates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

//This example uses Supplier to return a current date-time.
public class Java8Supplier1 {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		
		LocalDateTime time = s.get();

		System.out.println(time);

		  
		 Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		  String time2 =s1.get();
		  System.out.println(time2);
		 

	}

}