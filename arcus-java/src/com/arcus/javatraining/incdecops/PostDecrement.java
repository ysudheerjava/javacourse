package com.arcus.javatraining.incdecops;
class PostDecrement {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x--);
        int y = x--;
        System.out.println("y value is: " + y);
    }
}