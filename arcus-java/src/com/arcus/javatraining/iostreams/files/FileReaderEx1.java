package com.arcus.javatraining.iostreams.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("mycountry.txt");

		int i = fr.read();

		System.out.println(i);
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}

	}
}