package com.arcus.javatraining.iostreams.files.serialization.staticserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.arcus.javatraining.iostreams.files.serialization.staticserialization.Student;

public class ExampleSerialize {
	public static void main(String args[]) throws Exception {
		Student std1 = new Student("Krishna");
		FileOutputStream fos = new FileOutputStream("d:\\student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std1);

		FileInputStream fis = new FileInputStream("d:\\student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student std2 = (Student) ois.readObject();
		System.out.println(std2.getName());
	}
}