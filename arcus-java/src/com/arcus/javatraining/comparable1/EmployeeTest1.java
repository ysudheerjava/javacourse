package com.arcus.javatraining.comparable1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest1 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(100, "Sudheer"));
		al.add(new Employee(29, "Vinod"));
		al.add(new Employee(344, "Ram"));
		al.add(new Employee(29, "Rahim"));
		al.add(new Employee(56, "Robert"));

		System.out.println("****Before sorting the Employee's empName****");
		for (Employee empObj : al) {
			System.out.println(empObj.getEmpName());
		}

		Collections.sort(al);

		System.out.println("****After sorting the Employee's empName****");
		for (Employee empObj : al) {
			System.out.println(empObj.getEmpID());
		}

	}

}
