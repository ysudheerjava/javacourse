package com.arcus.javatrainings.collections.map;
// Java program demonstrating use of keySet()
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
 
class HashMapEx {
    public static void main(String[] args)
    {
        // making map of Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
       
        // adding the key-value pairs to map
        map.put(1, "Java");
        map.put(2, "Testing");
        map.put(3, "Mainframes");
 
        // below are the different and simple ways out of
        // many  to iterate over the keySet()
 
        // iterating the keySet() using iterator
        Iterator<Integer> itr = map.keySet().iterator();
       
        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
 
        // iterating the keySet() using for loop
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
 
        System.out.println();
       
        // iterating over the keySet() by converting the map
        // to the string
        System.out.println(map.keySet().toString());
    }
}