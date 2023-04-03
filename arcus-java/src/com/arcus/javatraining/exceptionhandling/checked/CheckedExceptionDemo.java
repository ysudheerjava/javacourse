package com.arcus.javatraining.exceptionhandling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		try {
		FileInputStream ex = new FileInputStream("c:/Desktop/abc.txt");
		}catch(IOException e) {
			//e.printStackTrace();
		}
		
		System.out.println("after exception");

	}

}
