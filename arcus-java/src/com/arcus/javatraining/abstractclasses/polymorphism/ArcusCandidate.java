package com.arcus.javatraining.abstractclasses.polymorphism;

public class ArcusCandidate extends Candidate {
	

	
	  public void getCandidateDetails(int age, String name,String course) {
	  System.out.println("In child class");
	  System.out.println("Candidate Age: "+age+ " Candidate Name: "+name+
	  " Candidate Course: "+course);
	  
	  }
	 
	

	public static void main(String[] args) {
	
		ArcusCandidate ac= new ArcusCandidate();
		
		//ac.getCandidateDetails();
		ac.getCandidateDetails(30, "Chakri", "Testing");
		
		Candidate cand = new Candidate();
		cand.getCandidateDetails(30, "Chakri", "Testing");

	}

}
