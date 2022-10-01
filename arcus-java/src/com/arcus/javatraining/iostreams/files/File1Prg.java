package com.arcus.javatraining.iostreams.files;
import java.io.*;
public class File1Prg {

	
	public static void main(String[] args)throws IOException
	{

	File f1 = new File("MySubDir2"); //subdrectory
	f1.mkdir();
		
	/*
	 * File f2 = new File("MySubDir2","Myfile.txt"); f2.createNewFile();
	 */
	
	
	 File f = new File(f1, "MyFile2.txt");
	 f.createNewFile();
	

	}
	}

