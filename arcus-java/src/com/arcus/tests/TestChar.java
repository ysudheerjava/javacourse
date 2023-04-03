package com.arcus.tests;

public class TestChar {
	
	public static void main(String args[]) {
	
		char c ='A';
		System.out.println(c);
		int a=c;
		System.out.println(a);
		
		char b =(char) a;
		System.out.println(b);
		
		
		String s = "s";
		System.out.println(s);
		
		//int to String
		int m =200;
		String g = Integer.toString(m);
		
		//Integer. parseInt converts a String to a primitive int 
		
		int k =Integer.parseInt(g);
		
	}

}
