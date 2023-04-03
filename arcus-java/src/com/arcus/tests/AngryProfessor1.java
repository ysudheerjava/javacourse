package com.arcus.tests;

//Problem: https://www.hackerrank.com/challenges/angry-professor
//Java 8
import java.io.*;
import java.util.*;

public class AngryProfessor1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        System.out.println("Number of Contestants : " +T);
        
        testCases:
        for(int i = 0; i < T; i++)
        {
            int n = input.nextInt();
            System.out.println("Number of Judges: " +n);
            int k = input.nextInt();
            System.out.println("Approvals required: " +k);

            int onTime = 0;
            for(int j = 0; j < n; j++)
            {
                int arrivalTime = input.nextInt();
                if(arrivalTime <= 0)
                {
                    onTime++;
                }
            }
            if(onTime >= k)
            {
                System.out.println("Selected");
            }
            else
            {
                System.out.println("Rejected");   
            }
        }
    }
}