package com.arcus.javatraining.iostreams.files.serialization.staticserialization;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
   private static String name;
   public Student(String name){
      this.name = name;
   }
   public static String getName() {
      return name;
   }
   public static void setAge(String name) {
      Student.name = name;
   }
}