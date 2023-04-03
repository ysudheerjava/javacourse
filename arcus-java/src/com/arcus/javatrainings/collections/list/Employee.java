package com.arcus.javatrainings.collections.list;

public class Employee {

	int empId;
	String empName;

	public Employee(int empID, String empName) {
		this.empId = empID;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
