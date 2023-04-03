package com.arcus.javatraining.iostreams.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		try (FileWriter fw = new FileWriter("java.txt")) {
			// FileWriter fw = new FileWriter("java.txt");

			fw.write(100); // print d

			fw.write("\n");

			char[] ch = { 'a', 'b', 'c', 'd' };
			fw.write(ch); // print character array

			fw.write("\n");

			String str = "India is great";
			fw.write(str); // prints a String

			fw.flush();
		} // flushes out the data from the stream
			// fw.close(); // closes the FileWriter resour e

	}

}
