package com.arcus.javatraining.comparable1;

import java.util.ArrayList;
import java.util.Collections;

import com.arcus.javatraining.comparable.Car;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Bajesh");

		Employee emp2 = new Employee(102, "Buraj");

		Employee emp3 = new Employee();
		emp3.setEmpID(104);
		emp3.setEmpName("Akbar");

		Employee emp4 = new Employee();
		emp4.setEmpID(103);
		emp4.setEmpName("Sud");

		Employee emp5 = new Employee();
		emp5.setEmpID(103);
		emp5.setEmpName("ABC");

		ArrayList<Employee> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);

		System.out.println("Before sort: ");
		for (Employee emp : al) {
			System.out.println(emp.getEmpID() + " " + emp.getEmpName());
		}

		Collections.sort(al);

		System.out.println("After sort: ");
		for (Employee emp : al) {
			System.out.println(emp.getEmpID() + " " + emp.getEmpName());
		}

	}

}
