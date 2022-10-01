package com.arcus.javatraining.abstractclasses;

public abstract class Engineer implements TestIface {
	
	String degreeName;
	String university;

	Engineer(String degree,String university){
		this.degreeName=degree;
		this.university=university;
	}
	
	

}
