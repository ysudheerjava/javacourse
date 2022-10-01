package com.arcus.javatraining.comparable;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Integer ramsage= 56;
		Integer samsage= 33;
		Integer xage=33;
		
		int comparisonA = ramsage.compareTo(samsage);//returns 1
		
		int comparisionB = samsage.compareTo(ramsage); //-1
		
		int comparisionC = samsage.compareTo(xage);  //both are equal , return zero
		
		System.out.println(comparisonA);
		System.out.println(comparisionB);
		System.out.println(comparisionC);
		
		
		
		
	
		
	

		
		
		
	}

}
