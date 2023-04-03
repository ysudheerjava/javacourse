package com.arcus.javatraining.incdecops;
class PostIncrement {

    public static void main(String[] args) {       
        int x = 10;   
        System.out.println(x++);// Prints 10
        int y = x++;   
        
        System.out.println("y value is: " + y);   // 11
    
    }

}