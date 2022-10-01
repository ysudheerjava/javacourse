package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.IOException;

class File3Prg {
	public static void main(String[] args) throws IOException {
		File f1 = new File("ArcusFolder");
		f1.mkdir();
		File f2 = new File("ArcusFolder", "abc.txt");
		f2.createNewFile();
	}
}