package com.arcus.javatraining.generics.training;

public class Printer<T> {

	T thingToPrint;
	//T thingsToShout;


	//String thingToShout;

	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	

	public void print() {
		System.out.println(thingToPrint);
	}

	
	public <T> void genericMethod(T genericArg) { 
		  System.out.println(genericArg);
	  }
	  
	  
		public <K, L, M> void iGgenericMethod(K genericArg,L secondArg,M thirdArg) { 
		  System.out.println(genericArg);
	  }
	  
	  public <T> T genericReturn(T type)
	  {
	    return type;
	  }
	 

	

}
