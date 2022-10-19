package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public static void main(String args[]) throws IOException {
		
		User user = new User();
		
		user.name= "Arcus";
		user.age=40;
		user.password ="arcuss";
		
		/*
		 * Serialization process. 
		 * 
		 * Step1: Create an instance of FileOututStream and pass the
		 * name of file as an argument to FileOutputStream Constructor.
		 * 
		 * Step2: Create an instance of ObjectOutputStream, 
		 * Pass the FileOutputStream reference as an argument to ObjectOutputStream constructor
		 * 
		 * Step3: Call writeObject() method of ObjectOutputStream class,
		 *  and pass the object to be serialized as an argument to writeObject() method. eg. writeObject(user)
		 *  
		 *  Step4: call close() method of ObjectOutputStream and FileOutputStream after flushing the object. 
		 */
		
		FileOutputStream fos = new FileOutputStream("user.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		fos.close();
		oos.flush();
		oos.close();
		System.out.println("User object saved..");
		
		
		
		
		
		
		
		
	}

}
