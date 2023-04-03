package com.arcus.javatraining.iostreams.files.training;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("Holder.txt");
		
		//Using createNewFile() method to create a file. 
		
		//To create a new File
		f.createNewFile();
		
		//To create a directory
		f.mkdir();
		

	}

}
