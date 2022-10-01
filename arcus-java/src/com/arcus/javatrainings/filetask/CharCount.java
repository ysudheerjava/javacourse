package com.arcus.javatrainings.filetask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharCount {

	public static void main(String[] args) throws IOException {
		BufferedReader read = null;

		int count = 0;

		try {
			read = new BufferedReader(new FileReader("pledge.txt"));

			String currentLine = read.readLine();

			while (currentLine != null) {

				String[] words = currentLine.split(" ");

				for (String word : words) {
					count = count + word.length();
				}
				currentLine = read.readLine();
			}
			System.out.println("Number Of Chars In A File : " +count);

		}

		finally {
			try {
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}