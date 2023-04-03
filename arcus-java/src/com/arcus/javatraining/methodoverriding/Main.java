package com.arcus.javatraining.methodoverriding;
class Main {

   public static void main(String args[]) {

      Physics a = new Physics(); // Physics reference and object

      Physics b = new Topic(); // Physics reference but Topic object

      a.say(); // runs the method in Physics class

      b.say(); // runs the method in Topic class

   }

}