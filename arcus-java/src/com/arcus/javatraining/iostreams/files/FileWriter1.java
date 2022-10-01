package com.arcus.javatraining.iostreams.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Program to list only the directories in  folder. 
public class FileWriter1 {

	public static void main(String[] args)throws IOException
	{
	FileWriter fw=new FileWriter("arcus4.txt",true);
	fw.write(97);//adding a single character
	fw.write("rcus\nInfotech");
	fw.write("\n");//\n may not work sometimes
	char[] ch={'a','b','c'};
	fw.write(ch);
	fw.write("\n");
	fw.flush();
	fw.close();
	}

}
