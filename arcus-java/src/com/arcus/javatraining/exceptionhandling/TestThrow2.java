package com.arcus.javatraining.exceptionhandling;
import java.io.*;  
  
public class TestThrow2 {   
  
    //main method  
    public static void main(String args[]){  
        try  
        {  
        	 FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
             BufferedReader fileInput = new BufferedReader(file);  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}    