package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class CustomizedSerializeDemo {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);
		
		FileOutputStream fos = new FileOutputStream("abcd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("abcd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}