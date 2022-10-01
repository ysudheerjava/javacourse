package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws IOException {

	File f = new File("newfile.txt");
	
	FileWriter fw = new FileWriter(f);
	
	//PrintWriter pw = new PrintWriter(f);
	
	PrintWriter pw = new PrintWriter("anotherfile.txt");
	
	//PrintWriter pw = new PrintWriter(fw);
	
	pw.write(100);
	
	pw.println(100);
	
	
	pw.println("Arcus");
	pw.println("Limited");
	
	pw.flush();
	
	
	
	}
	
	
	
	
		
}
