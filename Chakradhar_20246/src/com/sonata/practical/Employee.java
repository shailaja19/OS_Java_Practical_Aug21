package com.sonata.practical;

//creation of abstract Employee class
public abstract class Employee {
	// defining the attributes of the employee class using protected modifier
	// I used protected because there is no use of defining constructor
	// to set the values as we cannot create the object and the work is done easily
	protected int EmployeeId;
	protected String EmployeeName;
	protected Address address; // object of Address class
	protected double BasicPay;
	protected int noLeaves;

	public abstract double calculateSalary(); // abstract method calculateSalary() return type:double

	public abstract void applyLeave(int days); // abstract method applyLeave(int leaves) return type:void

	@Override
	public String toString() {// toString() is defined here, so that i don't have to define for each sub class
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", address=" + address
				+ ", BasicPay=" + BasicPay + ", noLeaves=" + noLeaves + "]";
	}
}
