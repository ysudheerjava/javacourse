package com.arcus.javatraining.staticexample;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		//System.out.println("student1 initial age: " + student1.age); // 20
		student1.age = 21;
		//System.out.println("student1 modified age: " + student1.age); // 21
		
	//	System.out.println("Static variables for student1  ");
		//System.out.println("student1 Static variable collegeName before Modification: "+ student1.collegeName); //n
	    //student1.collegeName ="Wesley College";
	//	System.out.println("student1 Static variable collegeName after Modification: "+ student1.collegeName); //w
		

		Student student2 = new Student();
	//	System.out.println("student2 initial age: " + student2.age); // 20
		student2.age = 23;
	//	System.out.println("student2 modified age: " + student2.age); // 23
		
		System.out.println("Static variables for student2  ");
	//	System.out.println("student1 Static variable collegeName before Modification: "+ student2.collegeName); //w
	//	student2.collegeName ="Xyz College";
	//	System.out.println("student2 Static variable collegeName after Modification: "+ student2.collegeName); //xyz
		

	}

}
