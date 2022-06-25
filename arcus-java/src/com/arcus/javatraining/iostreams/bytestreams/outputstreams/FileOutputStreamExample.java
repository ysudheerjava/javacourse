package com.arcus.javatraining.iostreams.bytestreams.outputstreams;

 import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {  
    public static void main(String args[]){    
    	
    	//System.out.println("File handling");
		
		
		/*
		 * try{ FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		 * fout.write(65); fout.close(); System.out.println("success...");
		 * }catch(Exception e){System.out.println(e);}
		 * 
		 */
    	
    	
    	try {
    	
    	FileOutputStream fout = new FileOutputStream("D:\\ArcusText.txt");
    	
    	fout.write(65);
    	
    	fout.close();
    	}catch(FileNotFoundException fe) {
    		fe.printStackTrace();
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
      }    
}  