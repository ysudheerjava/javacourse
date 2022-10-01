package com.arcus.javatraining.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableApp {

	public static void main(String[] args) {

		Student student1 = new Student(22, "Chaturvedi");
		Student student2 = new Student(22, "Rahul");
		Student student3 = new Student(20, "Raveena");
		Student student4 = new Student(45, "Ram");
		Student student5 = new Student(45, "Jam");

		ArrayList<Student> al = new ArrayList<>();
		al.add(student1);
		al.add(new Student(22, "Rahul"));
		al.add(new Student(20, "Raveena"));
		al.add(student4);
		al.add(student5);

		Collections.sort(al);

		for (Student student : al) {
			System.out.println(student.getAge() + " " + student.getName());
		}

	}

}
