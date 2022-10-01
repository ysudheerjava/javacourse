package com.arcus.javatraining.comparable;

public class Student implements Comparable<Student> {

	private Integer age;
	private String name;

	public Student(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student student) {

		int ageComparisionResult = this.age.compareTo(student.age);

		if (ageComparisionResult != 0) {
			return ageComparisionResult;
		} // if objects are equal compare another field...

		return this.name.compareTo(student.name);
	}

}
