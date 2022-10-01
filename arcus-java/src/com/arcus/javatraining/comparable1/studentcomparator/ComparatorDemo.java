package com.arcus.javatraining.comparable1.studentcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> studentsList = new ArrayList<>();

		studentsList.add(new Student(20, "Sarath", 3));

		studentsList.add(new Student(29, "Sakumarrath", 43));
		studentsList.add(new Student(21, "ram", 22));
		studentsList.add(new Student(20, "rony", 1));

		StudentAgeComparator ageComparator = new StudentAgeComparator();
		
		StudentRankComparator rankComparator = new StudentRankComparator();

		System.out.println("Before Sorting");
		for (Student s : studentsList) {

			System.out.println(s.getAge() + "|" + s.getStudentName() + "|" + s.getRank());
		}

		
		  Collections.sort(studentsList, rankComparator); 
		  System.out.println();
		  
		  System.out.println("After Sorting"); 
		  
		  for (Student s : studentsList) { 
		  System.out.println(s.getAge() + "|" + s.getStudentName() + "|" +s.getRank()); 
		  }
		 

	}

}
