package com.arcus.javatraining.generics;

public class DemoGen {
	
	
		  public static void main(String[] args) {

		    // initialize the class with Integer data
		    DemoClass demo = new DemoClass();

		    // generics method working with String
		//    demo.<String>genericsMethod("Java Programming");

		    // generics method working with integer
		    demo.<Integer>genericsMethod(25);
		    
		    
		   // We can call the generics method without including the type parameter. For example,

		//    demo.genericsMethod("Java Programming");
		    demo.genericsMethod(23);
		  //  In this case, the compiler can match the type parameter based on the value passed to the method.
		    
		  }
		}

