package com.arcus.javatraining.immutability;

public class TestImmutableStudent1 {
	public static void main(String[] args) {

	    Age age = new Age();
	    age.setDay(1);
	    age.setMonth(1);
	    age.setYear(1992);
	    ImmutableStudent1 student = new ImmutableStudent1(1, "Alex", age);

	    System.out.println("Alex age year before modification = " + student.getAge().getYear());
	    age.setYear(1993);
	    System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}

}
