package com.arcus.javatraining.exceptionhandling.checked;
import java.io.*;
import java.util.Scanner;
 
// Main class
public class CheckedEx {
	
	
	public void readFile() throws IOException   {
		
		FileInputStream checkedEx = new FileInputStream("c:/Desktop/abc.txt");
		
		Scanner sc = new Scanner(System.in);
		
		
	}
 
    // Main driver method
    public static void main(String args[]) throws FileNotFoundException{
 
        // Reading content from file by passing local directory path
        // where file should exists
       
    
		
				FileInputStream checkedEx = new FileInputStream("c:/Desktop/abc.txt");
			
       
        // This file does not exist in the location
        // This constructor FileInputStream
        // throws FileNotFoundException which
        // is a checked exception
    }
}