package com.arcus.javatraining.iostreams.files.serialization.externalization;

// Java program to demonstrate working of Externalization
// interface
import java.io.*;

import com.arcus.javatraining.iostreams.files.serialization.Car;

public class ExternExample {

	public static void main(String[] args) {

		Car car = new Car("Ford", 20, 1995);
		Car newcar = null;

		// Serialize the car
		try {
			FileOutputStream fos = new FileOutputStream("car.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}

		// Deserialize the car

		try {
			FileInputStream fi = new FileInputStream("car.ser");
			ObjectInputStream si = new ObjectInputStream(fi);

			newcar = (Car) si.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Before externalizing...");
		System.out.println("The original car is:\n" + car);
		System.out.println();
		System.out.println("After externalizing...");
		System.out.println("The new car is:\n" + newcar);

	}
}
