package com.arcus.javatrainings.collections.set;
import java.util.*;  
public class LinkedHashSetExample{  
 public static void main(String args[]){  
 //Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("Nutrine");    
               set.add("Dairy Milk");    
               set.add("Kitkat");   
               set.add("Mars");  
               set.add("Hersheys");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
 }  
}