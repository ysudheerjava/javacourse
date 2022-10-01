package com.arcus.javatraining.strings.stringbuffer;

import org.openjdk.jol.vm.VM;

public class StringBufferExample {
	

	
	  public static void main(String[] args) {
		  
	
	
	    StringBuffer strBuff = new StringBuffer("Arcus");
	    
	//System.out.println("The memory address is " + VM.current().addressOf(strBuff));
	    
	    strBuff.append("Tech"); // appends a string in the previously defined string.
	    System.out.println(strBuff);
	    strBuff.append(0); // appends a number in the previously defined string.
	    System.out.println(strBuff); 
	    
	// System.out.println("2 The memory address is " + VM.current().addressOf(strBuff));
	    
	    
	    
	  }
	}

