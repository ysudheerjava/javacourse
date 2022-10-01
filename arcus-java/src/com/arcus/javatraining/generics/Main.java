package com.arcus.javatraining.generics;
// Driver class to test above
public class Main {
  public static void main(String[] args)
  {
	  
	  
	  
		/*
		 * // creae a generics method
		 * 
		 * public <T> void genericsMethod(T data) {
		 * System.out.println("Generics Method:"); System.out.println("Data Passed: " +
		 * data); }
		 */ 
	  
    // instance of Integer type
    Test<Integer> iObj = new Test<Integer>(10);
    System.out.println(iObj.getObject());

    // instance of String type
    Test<String> sObj= new Test<String>("Sudheer Arcus");
    System.out.println(sObj.getObject());
  }
}
