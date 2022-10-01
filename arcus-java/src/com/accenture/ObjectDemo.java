package com.accenture;

import java.util.GregorianCalendar;

public class ObjectDemo {

   public static void main(String[] args) {

      // create a new ObjectDemo object
      GregorianCalendar cal = new GregorianCalendar();

      // print current time
      System.out.println("" + cal.getTime());

      // print a hashcode for cal
      System.out.println("cal.hashCode()" + cal.hashCode());

      // create a new Integer
      Integer i = 5;

      // print i
      System.out.println("i" + i);

      // print hashcode for i
      System.out.println("i.hashCode()" + i.hashCode());
   }
}