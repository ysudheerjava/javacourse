package com.arcus.javatraining.exceptionhandling.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	private static void checkedExceptionWithThrows() throws FileNotFoundException {
	    File file = new File("not_existing_file.txt");
	    FileInputStream stream = new FileInputStream(file);
	}
	
	public static void main(String args[]) throws FileNotFoundException  {
		
	//	checkedExceptionWithThrows();
		  File file = new File("not_existing_file.txt");
		    FileInputStream stream = new FileInputStream(file);
		
	}

}
