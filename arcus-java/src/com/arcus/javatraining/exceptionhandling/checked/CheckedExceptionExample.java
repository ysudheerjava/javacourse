package com.arcus.javatraining.exceptionhandling.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	/*
	 * private static void checkedExceptionWithThrows() throws
	 * FileNotFoundException{ System.out.println("1"); File file = new
	 * File("not_existing_file.txt"); System.out.println("2"); FileInputStream
	 * stream = new FileInputStream(file); System.out.println("Sudheer");
	 * 
	 * }
	 */
	
	public static void main(String args[]){
		
	//	checkedExceptionWithThrows();
		  System.out.println("1");
		  File file = new File("not_existing_file.txt");
		  System.out.println("2");
		    try {
				FileInputStream stream = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("3");
		
	}

}
