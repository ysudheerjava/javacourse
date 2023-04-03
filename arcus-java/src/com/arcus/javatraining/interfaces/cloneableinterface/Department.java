package com.arcus.javatraining.interfaces.cloneableinterface;
// java program to see CloneNotSupportedException

import java.io.*;
import java.util.*;

class Department implements Cloneable {
  // attributes of Department class
  String department_name = null;
  int department_id = 0;

  // create a default constructor
  Department() {}

  // create a parameterized constructor
  Department(String department_name, int department_id) {
    this.department_name = department_name;
    this.department_id = department_id;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    //  Department class instance creation
    Department d1 = new Department("Computer Science", 57);

    //cloning the department d1 to d2.
    Department d2 = (Department) d1.clone();
    System.out.println(d2.department_name);
  }
}
