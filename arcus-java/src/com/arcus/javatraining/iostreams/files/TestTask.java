package com.arcus.javatraining.iostreams.files;
public class TestTask {
    public static void main(String args[]){
        Task add = (int a, int b) -> {return (a+b);};
        Task subtract = (int a, int b) -> {return (a-b);};
        Task multiply = (int a, int b) -> {return (a*b);};
        Task divide = (int a, int b) -> {return (a/b);};
        Task remainder = (int a, int b) -> {return (a%b);};
        
        System.out.println("Sum  " +add.mytask(11, 5));
        System.out.println("Subtraction of 11 and 5 is " +subtract.mytask(11, 5));
        System.out.println("Multiplication " +multiply.mytask(11, 5));
        System.out.println("Division of 11 and 5 is " +divide.mytask(11, 5));
        System.out.println("Remainder of 11 and 5 is " +remainder.mytask(11, 5));
        
    }
}