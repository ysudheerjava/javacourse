package com.arcus.javatraining.iostreams.files.training;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException  {

		File file = new File("MyDirectory");
		
		//System.out.println(file.exists());
			
		
		file.createNewFile();//actual physical file creation
		
			
			///System.out.println(file.exists());
		
		//file.mkdir();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		String[] filesList = file.list();
		for(String f:filesList) {
			System.out.println(f);
		}
		
		
		
		
		
		
		
		

	}

}
