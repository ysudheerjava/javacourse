package com.arcus.javatraining.exceptions.customexceptions.jan3batch;

import java.io.IOException;

public class ThrowRunTimeExceptionDemo {

	public static void main(String[] args) throws IOException {

		// throw new IOException(); //If it is checked Exception like IOException, it
		// must follow HandleOrDeclare rule.

		throw new RuntimeException();
	}

}
