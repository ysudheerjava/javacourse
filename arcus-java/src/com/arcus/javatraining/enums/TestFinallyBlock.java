package com.arcus.javatraining.enums;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFinallyBlock {
	
	public static void main(String args[]) {
		//close() is in finally clause
		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
			out.println("the text");
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			out.close();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
