package com.arcus.javatraining.iostreams.files.training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		
			File file = new File("FileWriter.txt");

			//FileWriter fw = new FileWriter("FileWriter.txt");
			FileWriter fw = new FileWriter(file);
			
			
			fw.write('A');
			fw.write("\n");
			fw.write("String");
			char[] ch = {'A','R','C','U'};
			fw.write("\n");
			fw.write(ch);
			fw.flush();
			
			fw.close();
			
	}

}
