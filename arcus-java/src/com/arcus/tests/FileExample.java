package com.arcus.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("My Pledge.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f, true);
		String s = ("India is my country and all Indians are my brotherand sisters. "
				+ "I love my country and I am proud of itsrich and varied heritage. "
				+ "I shall always strive to bworthy of it. "
				+ "I shall give respect to my parents,teachers and elders and treat everyone withcourtesy."
				+ "To my country and my people, I pledgemy devotion. "
				+ "In their well being and prosperity alone, lies my happiness.");
		fw.write(s);
		int totalCharacters = 0;
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch == 'i')
				totalCharacters++;
			System.out.println(ch+"i appears" + totalCharacters + " times in this paragraph");
		}
		

		fw.flush();
		fw.close();

	}

}