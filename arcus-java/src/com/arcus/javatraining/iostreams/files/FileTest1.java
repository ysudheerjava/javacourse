package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String args[]) throws IOException {
		
		File f = new File("Arcus.txt");

	
		
		  f.createNewFile();
		  
	
		  
			/*
			 * File f = new File("newdirectory"); f.mkdir();
			 */
		 File f1 = new File("mydirectory","myFile.txt");
		 f1.createNewFile();
		 
		 System.out.println(f1.isFile());
		 System.out.println(f1.list());
		System.out.println(f1.isDirectory());
		System.out.println(f.length());
		System.out.println(f.delete());
		 
		 
		 
		
		
	}

}
