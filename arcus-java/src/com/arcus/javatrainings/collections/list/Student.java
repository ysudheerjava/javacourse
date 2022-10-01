package com.arcus.javatrainings.collections.list;

class Student {
  
    public int rollNo;
    public String studentName;
  
    // Student class constructor
    Student(int id, String name)
    {
        this.rollNo = id;
        this.studentName = name;
    }
    
    
    public void getStudentDetails()
    {
        System.out.println("Student Roll Number is: " + rollNo + " "
                           + "and Student name is: "
                           + studentName);
     
    }
    
    
  
  
}