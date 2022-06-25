package com.arcus.javatraining.iostreams.bytestreams.inputstreams;

import java.io.FileInputStream;  
public class FileInputStreamMultiCharExample {  
     public static void main(String args[]){    
          try{    
        	  
        	  String myString = new String("String");
        	  
        	  
				/*
				 * OutputStream output = new FileOutputStream("c:\\data\\output-file.txt");
				 * output.write("Hello World".getBytes()); output.close();
				 */
  
            FileInputStream fin=new FileInputStream("D:\\mytext.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  