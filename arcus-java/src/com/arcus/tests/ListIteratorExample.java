package com.arcus.tests;
import java.util.ArrayDeque;  
import java.util.ArrayList;  
import java.util.Deque;  
import java.util.Iterator;  
import java.util.List;  
import java.util.ListIterator;  
public class ListIteratorExample {  
  public static void main(String[] args) {  
       List<String>  li = new ArrayList<>();  
          ListIterator<String> itr = null;  
     
          li.add("Sudheer");  
          li.add("Vinod");  
          li.add("Gan");  
          li.add("Vik");  
       
          itr = li.listIterator();  
          System.out.println("In normal order :");  
          while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
         
          System.out.println("Using reverse order :");  
            
          while (itr.hasPrevious()) {  
                System.out.println(""+itr.previous());  
         }  
    }   
}  