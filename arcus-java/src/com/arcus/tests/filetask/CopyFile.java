package com.arcus.tests.filetask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis = null;
	        FileOutputStream fos = null;
	
	        try {
	         
	                fis = new FileInputStream( "pledge.txt");
	           
	            fos = new FileOutputStream("ourpledge.txt");
	 
	            int c;
	 
	            while ((c = fis.read()) != -1) {
	 
	  	                fos.write(c);
	            }
	 
	             System.out.println("copied the file successfully");
	        }
	 
	       
	        finally {
	 	 
	            if (fis != null) {
	 
	                fis.close();
	            }
	            if (fos != null) {
	 
	               fos.close();
	            }
	        }

	}

}
