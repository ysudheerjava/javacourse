package com.arcus.javatraining.identifiers;

/*A name in java program is called identifier.
 *It could be class name, method name, variable name and label name.*/

public class IdentifierExample {
	
	//Differentiating with case.
	int number=10;
	int Number=20;
	int NUMBER=20; 
	
	int myIntVariable =10;
	
	int total_number;//valid
	//int Total#; //invalid
	
	String ABC123; //---------valid
	//String 123ABC; 	//invalid
	
	//Reserved words cannot be identifiers.
	//int if=10; //invalid
	
	public static void main(String args[]) {
		
		//All predefined java class names and interface names we use as identifiers.
		int String=10; 
		
		//literals
		int x=01000; //(valid)
		long l=10L; //(valid)
		long l1=10; //(valid)
	//	int x=10l; // invalid cannot convert from long to int
		
		short shortVariable = 3276;
		//int x=0786; //8 is invalid Octal
		
	//	System.out.println(String);
		int i= 1000;
		
		char mychar ='s';
		
	}
	

}
