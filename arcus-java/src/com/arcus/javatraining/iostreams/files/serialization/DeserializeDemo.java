package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	
	    //Deserialization	
		FileInputStream fis = new FileInputStream("user.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User user = (User)ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(user.name+'|'+user.age +'|'+user.password );
		
		
		
	
	}

}
