package com.arcus.javatraining.exceptions.customexceptions.jan3batch;
public class MyException extends Exception {
	
	
	private  void throwMeAException() throws Exception
	{
	 
		Exception e = new MyException (); //We create an exception 

	  if(true) {
	    throw e; //We throw an exception 
	  } 
	}

}

