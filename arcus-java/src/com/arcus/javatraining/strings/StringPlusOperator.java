package com.arcus.javatraining.strings;

public class StringPlusOperator {

	public static void main(String[] args) {
		String unexpected = "1 + 1 = " + 1 + 1; 
		String expected   = "1 + 1 = " + (1 + 1);
		System.out.println(unexpected);
		System.out.println(expected);	
		
	/*	
		a + b + c
		is always regarded as meaning: (a + b) + c

		Therefore the result of the expression: 1 + 2 + " fiddlers"
		is: "3 fiddlers"*/
		
		String result = 1 + 2 + " fiddlers";
		System.out.println(result);

		/*but the result of: "fiddlers " + 1 + 2
		is: "fiddlers 12"*/
		
		String result1 = "fiddlers " + 1 + 2;
		System.out.println(result1);

		/*Another example: 1 + 1 + "" + 1 + 1
		will result in : 211*/
		
		String result3= 1 + 1 + "" + 1 + 1;
		System.out.println(result3);
		
		/*That is why, for your context "1 + 1 = " + 1 + 1;
		will result in string 1 + 1 = 11*/
		
		String result4 = "1 + 1 = " + 1 + 1;
		System.out.println(result4);
		
		
		/*But, "1 + 1 = " + (1 + 1); will result in 1 + 1 = 2*/
		String result5= "1 + 1 = " + (1 + 1);
		
		
		String result6 = 1+2+"Arcus";
		System.out.println(result6);
		
		String result7 = "Arcus"+1+2;
		System.out.println(result7);
		

		

	}

}
