package com.arcus.javatraining.exceptionhandling;

import java.util.ArrayList;

public class ExceptionTest1 {

	public void doTask() {
		doAnotherTask();
		System.out.println("doTask");
	}

	public void doAnotherTask() {

		doAnotherOtherTask();
		System.out.println("doAnotherTask");
	}
	


	public void doAnotherOtherTask() {
		System.out.println("doing another Othertask");
		int a = 10;
		int b = 0;

		
			System.out.println(a / b); // exception raised
		
	}

	
	public static void main(String args[]) {

		ExceptionTest1 ex = new ExceptionTest1();
		ex.doTask();
		
		
	}
}
