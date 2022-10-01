package com.accenture;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student() {
	
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public int compareTo(Student per) {
		if (this.age == per.age)
			return 0;
		else
			return this.age > per.age ? 1 : -1;
	}
	
	

	public static void main(String[] args) {
		
		Comparator<Student> ageComparator = new Comparator<Student>() {
		    @Override
		    public int compare(final Student s1, final Student s2) {
		        return s1.getAge() - s2.getAge();
		    }
		};
		Student e1 = new Student("Adam", 45);
		Student e2 = new Student("Steve", 60);
		int retval = e1.compareTo(e2);

		switch (retval) {
		case -1: {
			System.out.println("The " + e2.getName() + " is older!");
			break;
		}

		case 1: {
			System.out.println("The " + e1.getName() + " is older!");
			break;
		}

		default:
			System.out.println("The two persons are of the same age!");

		}
	}

	

	
}