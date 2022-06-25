package com.arcus.javatraining.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	public void readText() throws FileNotFoundException, IOException {

		BufferedReader br = null;
		br = new BufferedReader(new FileReader("abc.txt"));
		br.close();

	}

	public static void main(String args[]) throws FileNotFoundException {

		TestException te = new TestException();

		/*
		 * try {
		 * 
		 * ----- }catch() { ----
		 * 
		 * }
		 */

		/*
		 * System.out.println("Statement 1"); System.out.println("Statement 2"); int a
		 * =10; int b = 0; int result = a / b;
		 */

		System.out.println("Exception unhandled");

	}

}
