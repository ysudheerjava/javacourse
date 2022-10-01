package com.arcus.javatraining.exceptions.customexceptions;

public class IncorrectFileNameException extends RuntimeException {
	public IncorrectFileNameException(String errorMessage) {
		super(errorMessage);
	}

	public IncorrectFileNameException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}