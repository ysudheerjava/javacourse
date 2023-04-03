package com.arcus.javatrainings.java8features.methodreferences;
@FunctionalInterface
interface MyFunctionalInterface {
    
    String processString(String name);
}
 
public class MethodReferenceDemo {
    
    public static void main(String[] args) {
        
        MyFunctionalInterface f1 = s -> s.toUpperCase();
        System.out.println(f1.processString("Peter")); // PETER
      
      // Above two lines are equivalent to the following lines
        MyFunctionalInterface f2 = String::toUpperCase;
        System.out.println(f2.processString("Peter")); // PETER
    }
}