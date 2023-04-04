package com.arcus.javatraining.strings;

import org.openjdk.jol.vm.VM;

public class StrImmEx {

	public static void main(String[] args) {
	
		String newString = "Hello"; // String literal
		
		System.out.println(newString); //Hello
		
		System.out.println("The memory address of newString is " + VM.current().addressOf(newString));
	
		
		String anotherString= newString.concat(" World!");
		
		System.out.println("The memory address of anotherString is " + VM.current().addressOf(anotherString));
		
	
		
		
	
		
	}

}
