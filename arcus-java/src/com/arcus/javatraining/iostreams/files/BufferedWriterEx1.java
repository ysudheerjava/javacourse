package com.arcus.javatraining.iostreams.files;

import java.io.*;

class BufferedWriterEx1 {
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("arcusbuffered.txt", true);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c', 'd' };
		bw.write(ch);
		bw.newLine();
		bw.write("Arcus11111");
		bw.newLine();
		bw.write("Infotech Private Limited");
		bw.flush();
		bw.close();
		
		System.out.println();
	}
}