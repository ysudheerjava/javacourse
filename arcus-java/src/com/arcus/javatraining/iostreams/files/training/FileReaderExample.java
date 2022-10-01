package com.arcus.javatraining.iostreams.files.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("FileWriter.txt");

		//FileWriter fw = new FileWriter("FileWriter.txt");
		FileReader fw = new FileReader(file);
		
		
	

	}

}
