package com.arcus.javatraining.iostreams.files;

import java.io.File;

public class Listfiles {

	public static void main(String[] args) {
	
		File f = new File("C:\\mydirectory\\mysubdirectory");
		
		String[] fileList = f.list();
		
		for(String fileName: fileList) {
			
			System.out.println(fileName);
		}

		
	}

}


/*
 * f.exists();
 *  f.createNewFile();. if file already exists returns false. if not
 * exists creates a file and returns true. returns true or false. f.mkdir also
 * same.
 * 
 * f.isFile(); to check if f is pointing to file or not
 * 
 * f.isDirectory();
 * 
 * f.list(); returns the names of all files and directories present in specified
 * director. String[] s = f.list();
 * 
 * f.length() : returns long number of files in a directory. to remove f.delete.
 *
 *
 *FileWriter class
 *-----------------
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */