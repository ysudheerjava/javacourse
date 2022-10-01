package com.arcus.javatraining.iostreams.files.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {

		Student student = new Student();

		student.studentId = 100;
		student.studentAge = 20;
		student.studentName = "John";

		FileOutputStream fos = new FileOutputStream("student.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(student);

		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println("Student object saved/persisted");

	}

}
