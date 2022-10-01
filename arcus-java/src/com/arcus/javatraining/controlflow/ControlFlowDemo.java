package com.arcus.javatraining.controlflow;

public class ControlFlowDemo {
	
	
	
	public static void main(String args[]) {
		
		int n=9;
		
		/* if ..else
		 * 
		 * if (n % 2 == 0) System.out.println("Even");
		 
		 * if (n%2 != 0) System.out.println("Odd");
		 * 
		 * OR
		 */	
		
		
		/*
		 * if (n % 2 == 0) System.out.println("Even");
		 * 
		 * else System.out.println("ODD");
		 */
		
	
		/*
		 * if (n == 0) System.out.println("Even"); else if (n % 2 == 0)
		 * System.out.println("Even"); else System.out.println("Odd");
		 */
		
		
		/*
		 * if (n == 0) { System.out.println("Even"); 
		 * System.out.println("Good Morning");
		 * } else if (n % 2 == 0) System.out.println("Even");
		 *  else
		 * System.out.println("Odd");
		 */
		
		
		/*int num = 8;
		String msg = "";
		if(num > 10) {
		    msg = "Number is greater than 10";
		}
		else {
		    msg = "Number is less than or equal to 10";
		
		}*/
		
		//ternary operator
		
		int num=8;
		final String msg = num > 10 
				  ? "Number is greater than 10" 
				  : "Number is less than or equal to 10";
		
		


}
}
