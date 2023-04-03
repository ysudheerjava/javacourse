package com.arcus.practice;
public class Sort {
    public static void groupTotal(String[] value){
        int[] arr = new int[26];
        for (String val: value){
            arr[val.charAt(0)-'A'] = Integer.parseInt(String.valueOf(arr[val.charAt(0)-'A'])) + Integer.parseInt(val.substring(2));
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                System.out.print((char)(i+'A')+":"+arr[i]+" ");
            }
        }
    }

    public static void main(String[] args){
        String[] arr ={"B:-1", "A:1", "B:3", "A:5"};
        groupTotal(arr);
    }
}