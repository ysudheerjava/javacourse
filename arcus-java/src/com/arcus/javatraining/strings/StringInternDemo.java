package com.arcus.javatraining.strings;

public class StringInternDemo {

	public static void main(String[] args) {
	
		String myInstitute = "Arcus";
		String myCompany = new String("Arcus");
		
		System.out.println(myInstitute == myCompany);
		
		myCompany.intern();
		
	

		
		
		

	}

}
