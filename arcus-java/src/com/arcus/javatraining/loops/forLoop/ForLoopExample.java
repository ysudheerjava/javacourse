package com.arcus.javatraining.loops.forLoop;

//Program to print numbers from 1 to 10
public class ForLoopExample {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */

		int intArr[] = new int[3];
		
		//int intArr1[] = {10,20,30,40};

		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;

		System.out.println(intArr.length);//3
		
		/*
		 * for (int i = 0; i < intArr.length; i++) {
		 * 
		 * System.out.println(intArr[i]); }
		 */
		
		
		  for(int x:intArr)
		  { 
			  System.out.println(x); 
		  }
		 

	}

}
