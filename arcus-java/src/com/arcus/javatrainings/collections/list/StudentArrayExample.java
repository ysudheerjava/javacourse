package com.arcus.javatrainings.collections.list;

public class StudentArrayExample {

	public static void main(String args[])
    {
  
        // Declaring an array of student
        Student[] arr = new Student[1];
        
        int intArr[] = new int[10];
  
        // Allocating memory for 2 objects
        // of type student
     //   arr = new Student[2];
  
        // Initializing the first element
        // of the array
        arr[0] = new Student(100, "Sam");
  
        // Initializing the second element
        // of the array
        arr[1] = new Student(200, "Sai");
  
        // Displaying the student data
        System.out.println(
            "Student data in student arr 0: ");
        arr[0].getStudentDetails();
  
        System.out.println(
            "Student data in student arr 1: ");
        arr[1].getStudentDetails();
    }
}
	
	
	
	

