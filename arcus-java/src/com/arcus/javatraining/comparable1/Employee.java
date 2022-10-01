package com.arcus.javatraining.comparable1;

//Employee class to hold employee details
public class Employee implements Comparable<Employee> {

	private Integer empID;
	private String empName;
	
	public int age; 

	// Constructor to initialize empID and empName
	Employee(Integer empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	
	Employee() {
	
	}

	public Integer getEmpID() {
		return empID;
	}


	public void setEmpID(Integer empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public int compareTo(Employee o) {

		//int result = this.empID.compareTo(o.empID);
		int result = this.empID.compareTo(o.empID);
		return result;

	}

}
