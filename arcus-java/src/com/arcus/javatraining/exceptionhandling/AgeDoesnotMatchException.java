package com.arcus.javatraining.exceptionhandling;

public class AgeDoesnotMatchException extends Exception{

	 AgeDoesnotMatchException(String msg){
 
	   super(msg);
 }
	 
	/*
	 * public String toString(){ return
	 * "CustomException[Age is not between 17 and 24]"; }
	 */
  
}