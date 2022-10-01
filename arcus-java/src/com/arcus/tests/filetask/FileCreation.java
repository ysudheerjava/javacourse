package com.arcus.tests.filetask;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		//File f = new File("pledge.txt");
	//	System.out.println(f.exists());
		//	f.createNewFile();
		//System.out.println(f.exists());
		//	System.out.println(f.isFile());
	
	
	File file = new File("ourpledge.txt");
	System.out.println(file.exists());
		file.createNewFile();
	System.out.println(file.exists());
		System.out.println(file.isFile());
	}
}
