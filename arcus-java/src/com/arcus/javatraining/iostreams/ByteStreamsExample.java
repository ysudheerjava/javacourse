package com.arcus.javatraining.iostreams;

import java.io.File;
import java.io.IOException;

public class ByteStreamsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("sudheer.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	
		

	}

}
