package com.arcus.javatraining.strings.stringbuilder;

import org.openjdk.jol.vm.VM;

public class StringsVsStrBuilder {

	public static void main(String[] args) {

		StringBuilder myString1 = new StringBuilder("Arcus");
		
		System.out.println(myString1.reverse());
		
		
	
		System.out.println("The memory address is " + VM.current().addressOf(myString1));
		
		 myString1.append(" Private Limited"); //overwrites the current object
		
		 System.out.println("After concatenation: "+myString1);
		 
	//	System.out.println("The memory address is.... " + VM.current().addressOf(myString1));
		
	//	myString1= myString1.append("Private Limited"); //overwrites the current object
		
	//	System.out.println("2 The memory address is " + VM.current().addressOf(myString1));

		
		
	//	System.out.println(myString1);
	
		
		
		
		
		
		
		
	}

}
