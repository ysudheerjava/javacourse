package com.arcus.javatraining.abstractclasses;

public class Candidate {

	int age;
	String candidateName;
	String candidateCourse;

	//no-arg constructor
	public Candidate() {
	}
	
	// 2 argument constructor
	public Candidate(int age, String cName) {
		
		
		this.age=age;
		this.candidateName= cName;
		
	}
	
	//3 argument constructor
	public Candidate(int age, String cName, String course ) {
		
		this.age=age;
		candidateName= cName;
		candidateCourse =course;
		
	}
	
	
	public void getCandidateDetails() {
		System.out.println("In getCandidateDetails()..");
		System.out.println("Candidate Age: "+age+ " Candidate Name: "+candidateName);
	}
	
	public void getCandidateDetails(int age, String name, String course) {
		System.out.println("In overloaded method super class ..");

		System.out.println("Candidate Age: "+age+ " Candidate Name: "+candidateName+ " Candidate Course: "+course);
	}
	
	
	

	public static void main(String args[]) {

		Candidate cOne = new Candidate(20,"Sekhar");
		
		
		/*
		 * System.out.println("Candidate Age: "+cOne.age+
		 * " Candidate Name: "+cOne.candidateName+" Candidate Course: "+cOne.
		 * candidateCourse);
		 * 
		 * Candidate cTwo = new Candidate(30,"Ranbhir","Java");
		 * 
		 * 
		 * System.out.println("Candidate Age: "+cTwo.age+
		 * " Candidate Name: "+cTwo.candidateName+" Candidate Course: "+cTwo.
		 * candidateCourse);
		 */

		cOne.getCandidateDetails();
		
		cOne.getCandidateDetails(30,"Suman","Mainframes");
		
		
		
		
	}

}
