package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializaStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Student student = (Student) ois.readObject();

		System.out.println(student.studentId);
		System.out.println(student.studentAge);
		System.out.println(student.studentName);

		ois.close();
		fis.close();

	}

}
