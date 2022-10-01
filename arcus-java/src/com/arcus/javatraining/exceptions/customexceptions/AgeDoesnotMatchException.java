package com.arcus.javatraining.exceptions.customexceptions;

public class AgeDoesnotMatchException extends Exception{

	AgeDoesnotMatchException(String msg) {

		super(msg);
	}
	
	AgeDoesnotMatchException(){}
  
}