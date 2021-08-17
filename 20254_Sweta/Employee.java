package com.sonata;

public abstract class Employee {
	//declaring the employee attributes
	int eid;
    String ename;
	double salary;
	int leaves;
	Address add;
	//creating a method to calculate salary
	abstract double calculateSalary();
	//creating a method for granting leaves
	abstract void applyLeave(int days)throws NoLeaveAvailableException;
	//employee constraints
	Employee(int id,String name,Address add,double sal,int leaves){ 
		this.eid=id;
		this.ename=name;
		this.add=add;
		this.salary=sal;
		this.leaves=leaves;
	}

	//method to display employee name and ID
	public String toString() {
		return "Other Employees ID: " + eid +"\n" + "employee name:" + ename;
	}
	
	
}