package com.arcus.javatrainings.collections.list;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
   
	 List<String> students = new ArrayList<String>();
    
  
    students.add("Shekhar");
    students.add("Shoin");
    students.add("Sam");
    students.add("Imitiaz");
    System.out.println("Size of students object "+students.size()); ;
    students.get(0);
    System.out.println(students.get(0));
    
    students.set(0, "Shekharsfriend");
    System.out.println(students.get(0));
    students.remove(0);
    System.out.println(students);
 //students.clear();
 System.out.println("Students in myarraylist "+students);
 System.out.println("Size of students object "+students.size()); ;
    
    for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i));
      }
    
    for (String student:students) {
        System.out.println(student);
      }
    
    List<Integer> marks = new ArrayList<Integer>();
    marks.add(100);
    marks.add(200);
    marks.add(300);
    marks.add(400);
    
  }
}