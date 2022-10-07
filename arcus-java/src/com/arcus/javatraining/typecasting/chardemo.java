package com.arcus.javatraining.typecasting;

public class chardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a='5';
		System.out.println(a);//5
		
		char b='c';
		System.out.println(b);//c
		
		//characters will have a ASCII code value when you cast to int 
		int c=(int)a;
		System.out.println(c);//c
		
		System.out.println(Character.getNumericValue(c)); 
		
		
		
	}

}
