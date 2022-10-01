package com.accenture;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializationExample {
  public static void main(String args[]) throws Exception {
        Student student = new Student();
        Employee employee = new Employee();
        Car car = new Car();
        
        System.out.println("Serialization started");
        FileOutputStream fos = new FileOutputStream("test.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.writeObject(employee);
        oos.writeObject(car);
        System.out.println("Serialization ended");
        
        System.out.println("Deserialization started");
        FileInputStream fis = new FileInputStream("test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student stu = (Student) ois.readObject();
        Employee emp = (Employee) ois.readObject();
        Car c = (Car) ois.readObject();
        
        System.out.println("Deserialization ended");
        
      //  System.out.println("name: " + stu.name);
        System.out.println("age: " + emp.age);
        System.out.println("c: " + c.wheels);
    }
}