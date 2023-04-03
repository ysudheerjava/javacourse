package com.arcus.javatraining.abstractclasses;

public abstract class Institute {

	// abstract method
	public abstract String getInstituteAddress();
	
	public abstract int getInstituteStrength();

	
	  // concrete method
	public String getInstituteName() {
		return "Arcus Institute"; 
		}
	 
}
