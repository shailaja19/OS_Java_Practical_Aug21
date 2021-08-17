package com.sonata.Test;

public abstract class Employee {
	int empid;
    String ename;
	double basicpay;
	int leavesavailable;//Initializing attributes
	Address obj;
	
	
	abstract double calsal(double salary);//abstract calsal method which is implemented in subclasses
	
	abstract void applyLeave(int noofdays) throws MyOwnException;
	
	Employee(int empid,String ename,double basicpay,int leavesavailable){
		//employee constructor helps to initialize values from main method using employee instance
		this.empid=empid;
		this.ename=ename;
		this.basicpay=basicpay;
		this.leavesavailable=leavesavailable;
	}
	@Override
	public String toString() {
		//overriding the to string method to display ename and empid;
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}
	
	
	
	
	
	
}

