package com.arcus.javatraining.operators;

public class OperatorDemo {
	
	/*
	 * Arithemetic Operators 
	 * Bitwise Operators
	 * Relational Operators 
	 * Logical Operators
	 */
	
	public static void main(String args[]) {
		
		int a =30, b=20;
		int s1= a+b;
		int s2= a-b;
		int s3= a*b;
		
		double s4= (double) (a/b);
		
		int s5 = a%b; //Gives the remainder in the division
		
		
		/*
		 * System.out.println(a); System.out.println(b); System.out.println(s1);
		 * System.out.println(s2); System.out.println(s3); System.out.println(s4);
		 * 
		 */
		
		
		//short hand operators
		int n = 5;
		int m =10;
		
		/*
		 * n= n + m;
		 * n += m; // same as n= n+m;
		 * n+=1; //same as n=n+1 
		 * n++ ; //same as n=n+1;
		 */
		//Pre-increment and Post- increment operators
		
		//m=n++; //pre increment operator
		//++n; //Post increment operator
		
		/*
		 * System.out.println(m); System.out.println(n); System.out.println(m);
		 */
		
			int a1=10;  
			int b1=10;  
			System.out.println(a1++);
			System.out.println(a1);
			System.out.println(++a1);
			System.out.println(a1++ + ++a1);//10+12=22  
			System.out.println(b1++ + b1++);//10+11=21 
			//System.out.println(a1%);
			  
		
		
		
	}

}
