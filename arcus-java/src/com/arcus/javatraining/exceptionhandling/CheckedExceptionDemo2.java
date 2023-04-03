package com.arcus.javatraining.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo2 {

	public void method4() throws FileNotFoundException {
		//throw new NullPointerException();	
		throw new FileNotFoundException();	
	}

	public void method3() throws FileNotFoundException {

		method4();
		System.out.println("In method3");
	}

	public void method2() throws FileNotFoundException {

		method3();
		System.out.println("In method2");
	}

	public void method1() throws FileNotFoundException  {

		method2();
		System.out.println("In method1");

	}

	public static void main(String[] args) throws FileNotFoundException {

		CheckedExceptionDemo2 demo = new CheckedExceptionDemo2();
		demo.method1();
		System.out.println("In the main method");

	}

}
