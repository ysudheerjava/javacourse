package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student student = (Student) ois.readObject();

		System.out.println(student.studentId);
		System.out.println(student.studentName);
		System.out.println(student.studentAge);

		ois.close();
		fis.close();

	}

}
