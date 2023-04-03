package com.arcus.javatrainings.java8features;

public class TestLambda {

	public static void main(String[] args) {
		
		
		FIface1 f1;
		
		Interf2 f2;
	
		f1= (x,y) -> x+y;
		
		f2=()->System.out.println("Hello World");
		
		System.out.println(f1.doSum(10, 20));
		
		f2.m1();
		
		/*
		 * public int doSum (int i, int j){
		 * 
		 * return i+j
		 * 
		 * }
		 */
		
		
		

	}

}
