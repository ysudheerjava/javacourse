package com.arcus.javatraining.strings;
import java.util.StringTokenizer;  
public class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan","a");
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
     
     String myString ="Indiaismycoutry";
     StringBuilder myString1 =new StringBuilder("Indiaismycoutry");
     myString1.reverse();
     System.out.println(myString);
     
   }  
} 