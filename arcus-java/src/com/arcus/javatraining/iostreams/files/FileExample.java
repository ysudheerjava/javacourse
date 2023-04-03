package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {

		File file = new File("arcus.txt");

		// System.out.println(file.exists());

		file.createNewFile();

		// System.out.println(file.exists());

		File f2 = new File("mydirectory");
		f2.mkdir();

		// System.out.println(f2.isFile());

		// System.out.println(f2.isDirectory());

		// File f = new File(String subdirectory, String name)

		File f3 = new File("mydirectory", "abc.txt");
		f3.createNewFile();

		File f4 = new File("mydirectory");

		String[] fileList = f4.list();

		for (String filename : fileList) {
			System.out.println(filename);
		}

	}

}
