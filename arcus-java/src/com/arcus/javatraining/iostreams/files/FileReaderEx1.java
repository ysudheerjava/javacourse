package com.arcus.javatraining.iostreams.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("mycountry.txt");

		int i = fr.read();
		
		
		//It attempts to read next character from the file and return its Unicode value.
		//method returns unicodevalue , while printing we have to perform type casting.
		
		System.out.println((char)fr.read());
		
		
		
		  char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
		  
		  System.out.println("Number of chars in char array: "+fr.read(charArray));
		  System.out.println(i); //the next character is not available then we will get -1. 
		  while (i != -1) { 
			  System.out.print((char) i);
			  i = fr.read();
			  }
		 

	}
}