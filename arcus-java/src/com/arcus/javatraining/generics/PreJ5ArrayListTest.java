package com.arcus.javatraining.generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// Pre-JDK 5 Collection
public class PreJ5ArrayListTest {
	
	public static void main(String[] args) {
      // We create a List meant for String
      List strLst = new ArrayList();  // Pre-JDK 5 List holds Objects
     
      strLst.add("alpha");            // String upcasts to Object implicitly
      strLst.add("beta");
      
      Iterator iter = strLst.iterator();
      
      while (iter.hasNext()) {
    	  
         String str = (String)iter.next(); // need to explicitly downcast Object back to String
         System.out.println(str);
    
      }

      // We inadvertently add a non-String into the List meant for String
     
      strLst.add(Integer.valueOf(1234));       // Compiler and runtime cannot detect this logical error
      String str1 = (String)strLst.get(2); 
      
      if (strLst.get(2) instanceof String) {
      
      String str = (String)strLst.get(2);  // Retrieve and downcast back to String
     }
      // Compile ok, but runtime exception
      //java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
   }
}