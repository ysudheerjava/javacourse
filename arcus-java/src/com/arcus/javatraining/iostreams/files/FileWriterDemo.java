package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*File Writer  - To write character data to file:
==================================
FileWriter f = new FileWriter(String finame);
FileWriter f = new FileWriter(File f);

The above 2 are constructors for overriding of existing data.
Below for appending
FileWriter f = new FileWriter(String finame,boolean append);
FileWriter f = new FileWriter(File f, boolean append);*/




public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
	
		File f = new File("mycountry.txt");
		
		//FileWriter fw = new FileWriter(f);
		
		//FileWriter fw = new FileWriter("filewriter.txt",true);
		
		FileWriter fw = new FileWriter(f,true);
		
		
		fw.write("India is a wonderful country");
	

		
		//write(char[] ch)
		char[] ch={'a','b','c'};
		fw.write(ch);
		
		fw.write("\n");
		
		fw.write("India has 29 states");
		
		fw.flush();
		fw.close();

	}

}
