package com.arcus.javatraining.array;

import java.util.Scanner;

public class Stringtest {

public static void main(String[] args) {
         Scanner s = new Scanner(System.in);   //scanner
         
         System.out.println("Enter the length ");
         int value = s.nextInt(); //taking value or length
         
        String[] arr = new String[value]; //creating array with value
        System.out.println(value+"  array is of length "+arr.length);
        System.out.println("enter the element");
   

        for(int i=0; i<arr.length; i++) {
        System.out.println("value of i "+i);
       
        arr[i] = s.next(); //taking element from console
        }
       
        System.out.println("array elements are : ");
       
        for(int i=0; i<arr.length; i++) {
       
        System.out.println(arr[i]); //printing array element
        }

}

}