package com.arcus.javatraining.exceptionhandling.checked;
import java.io.*;
 
// Main class
public class CheckedEx {
 
    // Main driver method
    public static void main(String args[]) throws FileNotFoundException {
 
        // Reading content from file by passing local directory path
        // where file should exists
        FileInputStream CheckedEx = new FileInputStream("/Desktop/GFG.txt");
 
        // This file does not exist in the location
        // This constructor FileInputStream
        // throws FileNotFoundException which
        // is a checked exception
    }
}