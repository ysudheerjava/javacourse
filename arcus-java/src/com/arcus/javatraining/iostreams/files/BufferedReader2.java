package com.arcus.javatraining.iostreams.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader2 {

	public static void main(String[] args) throws IOException {
		//FileReader fr = new FileReader("arcusbuffered.txt");//create a FileReader object
		
		try(BufferedReader br = new BufferedReader(new FileReader("arcusbuffered.txt"))){
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
	}catch(IOException ie) {
		ie.printStackTrace();}
	}
}