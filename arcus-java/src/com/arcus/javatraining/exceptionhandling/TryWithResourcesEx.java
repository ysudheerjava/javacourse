package com.arcus.javatraining.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {

	public static void main(String[] args) throws IOException {
	
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
			
		}
		
		

	}
}
