package com.arcus.javatraining.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))) {
			//use be based on our requirement, br will be closed automatically , 
			//Once the control reaches end of try either normally
		//	or abnormally and we are not required to close explicitly
			 }
			catch(IOException e) {
			  e.printStackTrace();// handling code
			}

}
}
