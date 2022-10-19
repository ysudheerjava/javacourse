package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo1 {

	public static void main(String[] args) throws 
	IOException, ClassNotFoundException {
		
		
		/*
		 * De-Serialization process. 
		 * 
		 * Step1: Create an instance of FileInputStream class and pass the
		 * name of serialized file as an argument to FileInputStream Constructor.
		 * 
		 * Step2: Create an instance of ObjectInputStream, 
		 * Pass the FileInputStream reference as an argument to ObjectInputStream constructor
		 * 
		 * Step3: Call readObject() method of ObjectInputStream class,
		 * readObject method returns an instance of Object class, so  convert it into the required class. eg. Student student = (Student) ois.readObject();
		 *  
		 *  
		 *  Step4: call close() method of ObjectInputStream and FileInputStream object.. 
		 */

		FileInputStream fis = new FileInputStream("user.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user = (User) ois.readObject();

		System.out.println(user.age);
		System.out.println(user.name);
		System.out.println(user.password);

		ois.close();
		fis.close();

	}

}
