package com.arcus.javatraining.overloading.constructoroverloading;

class Student {
	
	int id;
	String name;
	String gender;
	
	Student(){
		
		id=10;
		name="Sudheer";
	}

	Student(int i, String n) {
		id = i;
		name = n;
	}

	
	Student(int i, String n,String gender) {
		id = i;
		name = n;
		this.gender=gender;
		
	}
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student();
		System.out.println(s3.id);
		s1.display();
		s2.display();
		
		
		Student student1 = new Student();
		
		
		
		Student student2 = new Student(30,"Arcus");
		
		Student student3= new Student(30,"Arcus","Male");
		

		int myIntLocalVar = student2.id;
		
		String myGender = student3.gender;
		
		System.out.println(myIntLocalVar);
		
		System.out.println(myGender);
		
		
		
		
		
	}

}