package com.arcus.javatraining.iostreams.files.training;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileWriter fw;
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(100);
		
		pw.print(100);
		
		//	
		pw.write(300); //
		pw.println(200);
		pw.println(true);
		pw.println("Arcus Infotech");
		char[] ch = { 'a', 'b', 'c', 'd' };
		pw.println(ch);
		pw.flush();
		pw.close();
		
		
		
		
		

	}

}
