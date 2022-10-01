package com.arcus.javatraining.iostreams.files.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {

		InputStream input = new FileInputStream("inputfile.txt");
		int data = 0;
		while (data != -1) {

			data = input.read();
			System.out.println( data);
		}

	}

}
