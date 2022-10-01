package com.arcus.javatraining.strings;

import org.openjdk.jol.vm.VM;

public class StringsEx {

	public static void main(String[] args) {

		String myCompany = "Arcus";
		String myCompany1 ="Arcus";
		String myCompany2 =new String("Arcus");
		myCompany2.intern();		
		
		System.out.println(myCompany1==myCompany2);

		System.out.println("The memory address is " + VM.current().addressOf(myCompany));
		System.out.println("The memory address is " + VM.current().addressOf(myCompany1));
		System.out.println("The memory address is " + VM.current().addressOf(myCompany2));

		myCompany.concat("Private Limited"); // overwrites the current object
		

		System.out.println("After concatenation: " + myCompany);
		

		System.out.println("The memory address is.... " + VM.current().addressOf(myCompany));
		

		myCompany = myCompany.concat("Private Limited"); // overwrites the current object
		

		System.out.println("2 The memory address is " + VM.current().addressOf(myCompany));

	}

}
