package com.arcus.javatraining.iostreams.files.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
	int age;
	String name;
	int year;

	public Car() {
		System.out.println("Default Constructor called");
	}

	public Car(String n, int age, int year) {
		this.name = n;
		this.year = year;
		this.age = age;
	}

	/*
	 * ObjectOutput extends the DataOutput interface to include writing of objects.
	 * 
	 * DataOutput includes methods for output of primitive types, ObjectOutput
	 * extends that interface to include objects, arrays, and Strings.
	 */

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);

		// out.writeInt(year);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		// year = in.readInt();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\n" + "Year: " + year + "\n" + "Age: " + age);
	}

}