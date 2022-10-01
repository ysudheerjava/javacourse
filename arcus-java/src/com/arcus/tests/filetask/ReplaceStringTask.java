package com.arcus.tests.filetask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStringTask {

	public static void main(String[] args) throws IOException  {
		File file = new File("pledge.txt");
		String search = "I";
		String replace = "We";

		try{
		    FileReader fr = new FileReader(file);
		    String s;
		    String totalStr = "";
		    try (BufferedReader br = new BufferedReader(fr)) {

		        while ((s = br.readLine()) != null) {
		            totalStr += s;
		        }
		        totalStr = totalStr.replaceAll(search, replace);
		        FileWriter fw = new FileWriter(file);
		    fw.write(totalStr);
		    fw.flush();
		    fw.close();
		    }
		}catch(Exception e){
		    e.printStackTrace();
		}

	}
}
