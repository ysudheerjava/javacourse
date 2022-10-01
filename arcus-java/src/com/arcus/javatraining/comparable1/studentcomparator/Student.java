package com.arcus.javatraining.comparable1.studentcomparator;

public class Student {

	private Integer age;
	private String studentName;
	private Integer rank;

	public Student(int age, String studentName,int rank) {

		this.age = age;
		this.studentName = studentName;
		this.rank = rank;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getRank() {
		return rank;
	}
	
	public void setRank(Integer rank) {
		this.rank = rank;
	}


}
