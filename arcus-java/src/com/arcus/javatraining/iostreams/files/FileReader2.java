package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args)throws IOException
	{
	File f=new File("D:\\arcus.txt");
	
	FileReader fr=new FileReader(f);
	

	char[] ch=new char[(int)f.length()]; 
	fr.read(ch);
	
	for (char ch1 : ch)
	{
	System.out.print(ch1);
	}
	}
	}


