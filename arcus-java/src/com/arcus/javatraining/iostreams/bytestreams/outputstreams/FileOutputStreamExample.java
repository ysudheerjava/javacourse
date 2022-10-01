package com.arcus.javatraining.iostreams.bytestreams.outputstreams;

 import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {  
    public static void main(String args[]){    
    	
    	
    	
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