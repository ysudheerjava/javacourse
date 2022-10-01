package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
	
		File f = new File("myfile.txt");
		
		
		System.out.println(f.exists()); //false
		
		f.createNewFile();
		System.out.println(f.isFile());
		
		System.out.println(f.exists());
		
		File mydir = new File("mydirectory");
		mydir.mkdir();
		
		
		
		
	}

}
