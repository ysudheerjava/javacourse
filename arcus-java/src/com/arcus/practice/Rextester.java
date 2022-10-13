package com.arcus.practice;

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        String input = "Hello cat Cats cats Dog woof dogs dog fox foxs Foxs";
     //String[] strArr=s.nextLine().replaceAll("[ \"{}\\]\\[\\nnew]","").split(",");   
        
        input = input.replaceAll("(?i)\\s*(?:fox|dog|cat)s?", "");
        System.out.println(input);
    }
}