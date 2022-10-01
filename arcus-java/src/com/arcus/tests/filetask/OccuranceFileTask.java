package com.arcus.tests.filetask;
import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class OccuranceFileTask {

	 public static void main(String[] args) throws IOException {

		   BufferedReader reader = new BufferedReader(new FileReader("pledge.txt"));
		            int ch;
		            char chSearch='l';
		            int count=0;
		            while((ch=reader.read())!= -1) {
		                if(chSearch == (char)ch) {
		                    count++;
		                }
		            }
		                reader.close();

		                System.out.println("l occurs " + count);
		           
	
	}

}
