package com.sonata.PracticalTest;

public abstract class Employee {
	
	// Employee Attributes
	int empId;
	String empName;
    double basic;
	int leaves;
	Address adr;
	
	
	//Constructor for Employee Class
	Employee (int a,String b,double c, int d)
	{
		this.empId=a;
		this.empName=b;
		this.basic=c;
		this.leaves=d;
	}
	
	// Getters and setters for employee attributes
	
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

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public int getLeaves() {
		return leaves;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	// Abstract method to calculate salary from basic for respective subclasses.
	public abstract double calsal();
	
	// Abstract method to calculate available number of leaves if any, otherwise exception is thrown.
	public abstract int applyLeave(int q) throws NoLeaveAvailableException;
}
