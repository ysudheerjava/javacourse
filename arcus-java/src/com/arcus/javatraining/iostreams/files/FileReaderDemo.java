package com.arcus.javatraining.iostreams.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("java.txt");) {

			int i;

			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			// fr.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
