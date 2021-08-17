package com.sonata.Employeedetails;
public abstract class Employee 
{
	int EmpId;
    String EmpName;
    Address obj; //Object is created for Address class
	double Basicpay;
	int Leaveavailable;
	abstract double calsal(double basicpay);//abstract method
	abstract void applyLeave(int noofdays) throws NoLeaveAvailableException;//abstract method
	//Constructor for  Employee class
	Employee(int EmpId,String EmpName,double BasicPay,int Leaveavailable)
	{
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.Basicpay=Basicpay;
		this.Leaveavailable=Leaveavailable;
	}
	@Override
	public String toString() {
		return "Employeeabstract [empid=" + EmpId + ", empname=" + EmpName + "]";
	}
	
}
