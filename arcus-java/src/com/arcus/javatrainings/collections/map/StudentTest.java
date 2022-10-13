package com.arcus.javatrainings.collections.map;

import java.util.HashMap;
import java.util.Map;

// Driver code 
class StudentTest {
	public static void main(String[] args) {

		// creating two Objects with
		// same state
		Student student1 = new Student("aditya", 1);
		Student student2 = new Student("aditya", 1);

		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));

		Map<Student, String> studentMap = new HashMap<Student, String>();
		studentMap.put(student1, "CSE");
		studentMap.put(student2, "IT");

		for (Student e : studentMap.keySet()) {
			System.out.println(studentMap.get(e).toString());
		}

	}
}
