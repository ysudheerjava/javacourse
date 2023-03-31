package com.arcus.javatraining.iostreams.files.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	int studentId;
	transient int studentAge;
	String studentName;

}
