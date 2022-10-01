package com.arcus.javatraining.comparable1.studentcomparator;

import java.util.Comparator;

import com.arcus.javatraining.comparator.Person;

public class StudentRankComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		return Integer.compare(s1.getRank(), s2.getRank());
	}
	

}
