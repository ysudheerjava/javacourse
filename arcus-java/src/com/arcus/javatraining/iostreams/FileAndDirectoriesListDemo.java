package com.arcus.javatraining.iostreams;

import java.io.*;

public class FileAndDirectoriesListDemo {
	public static void main(String[] args) throws IOException {
		int count = 0;
		File f = new File("D:\\arcus_training");
		String[] s = f.list();
		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("total number : " + count);
	}
}