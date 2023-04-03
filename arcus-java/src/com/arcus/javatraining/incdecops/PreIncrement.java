package com.arcus.javatraining.incdecops;
public class PreIncrement {
       
    public static void main(String[] args) {       
        int x = 10;      
        System.out.println(++x);
        int y = ++x;   
        System.out.println("y value is: " + y);
        System.out.println("y value is: " + ++x);   
        System.out.println("y value is: " + y);   
    }

}