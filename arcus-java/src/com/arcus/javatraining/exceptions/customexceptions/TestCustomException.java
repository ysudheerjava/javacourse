package com.arcus.javatraining.exceptions.customexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		
		String fileName ="MyFiles";
		String myText ;
		try (Scanner file = new Scanner(new File(fileName))) {
		    if (file.hasNextLine())
		    	myText= file.nextLine();
		} catch(FileNotFoundException e) {
			
			 if (!fileName.equals("MyFile")) {
			        throw new IncorrectFileNameException("Incorrect filename : " + fileName,e );
			    }
			//e.printStackTrace();
		    // Logging, etc 
		}

	}

}
