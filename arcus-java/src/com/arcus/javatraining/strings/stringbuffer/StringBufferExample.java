package com.arcus.javatraining.strings.stringbuffer;

public class StringBufferExample {
	

	
	  public static void main(String[] args) {
		  
		String str ="Hello";
		
		String myString = new String("Hello");
		
		
	    StringBuffer str1 = new StringBuffer("ContentWriter");
	    StringBuilder str2 = new StringBuilder("SSSS");
	    
	    StringBuffer str3 = new StringBuffer("ContentWriter");
	    
	    
	    int len = str1.length();
	    System.out.println("Length : " + len);
	    System.out.println(str1==str1);
	
	    
	    int cap = str1.capacity();
	    System.out.println("Capacity : " + cap);
	    
	    StringBuffer strBuff = new StringBuffer("Arcus");
	    strBuff.append("Tech"); // appends a string in the previously defined string.
	    System.out.println(strBuff);
	    strBuff.append(0); // appends a number in the previously defined string.
	    System.out.println(strBuff); 
	    
	  }
	}

