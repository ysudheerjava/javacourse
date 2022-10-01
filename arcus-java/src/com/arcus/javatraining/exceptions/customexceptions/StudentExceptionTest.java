package com.arcus.javatraining.exceptions.customexceptions;

import java.util.Scanner;

public class StudentExceptionTest {
   
	private String name;
   private int age;
   
   public StudentExceptionTest(String name, int age) throws AgeDoesnotMatchException{
     
         if (age<17||age>24) {
            String msg = "Age is not between 17 and 24";
        //    AgeDoesnotMatchException ex = new AgeDoesnotMatchException(msg);
            throw new AgeDoesnotMatchException(msg);
         }
     
     
      this.name = name;
      this.age = age;
   }
   
   public void display(){
      System.out.println("Name of the Student: "+this.name );
      System.out.println("Age of the Student: "+this.age );
   }
  
   public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the name of the Student: ");
      String name = sc.next();
      System.out.println("Enter the age of the Student, age must be between 17 to 24(including 17 and 24): ");
      int age = sc.nextInt();
      StudentExceptionTest obj = new StudentExceptionTest(name, age);
      obj.display();
   }
}