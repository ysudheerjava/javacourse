package com.arcus.javatraining.iostreams.files.serialization;

import java.io.Serializable;

public class User implements Serializable{
	
	String name;
	 String password;
	int age;
	static int myvar=10;
	
    public void sayHello() {
    	System.out.println("Hello");
    }
	

}
