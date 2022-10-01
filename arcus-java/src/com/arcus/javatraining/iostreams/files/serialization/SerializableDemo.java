package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public static void main(String args[]) throws IOException {
		
		User user = new User();
		
		user.name= "Arcus";
		user.age=40;
		user.password ="arcuss";
		
		FileOutputStream fos = new FileOutputStream("user.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		fos.close();
		oos.flush();
		oos.close();
		System.out.println("User object saved..");
		
		
		
		
		
		
		
		
	}

}
