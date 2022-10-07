package com.arcus.javatraining.exceptions.customexceptions;

public class AgeDoesnotMatchException extends RuntimeException{

	AgeDoesnotMatchException(String msg) {

		super(msg);
	}
	
	AgeDoesnotMatchException(){}
  
}