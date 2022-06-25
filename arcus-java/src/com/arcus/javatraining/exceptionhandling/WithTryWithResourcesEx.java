package com.arcus.javatraining.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithTryWithResourcesEx {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br=null;
		
		try{
		
		br=new BufferedReader(new FileReader("abc.txt"));
		return;
		
		
		}catch(IOException e) {
		System.exit(0);
	    e.printStackTrace();
		System.out.println( e.getMessage());
		System.out.println(e.toString());
		  
		  
		} finally {
		  if(br != null) {
		  br.close();
		}

	}

}
}
