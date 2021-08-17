package com.sonata.Employeedetails;
public class Staff  extends Employee //Employee class is inherited
{
	String title;
	public Address getObj() 
	{
		return obj;
	}
	//Constructor for staff class
	Staff(int EmpId,String EmpName,double BasicPay,int Leaveavailable,String title)
	{
		super(EmpId,EmpName,BasicPay,Leaveavailable);
		this.title=title;
	}
	//Exception Handling
	void applyLeave(int noofdays) throws NoLeaveAvailableException
	{
		this.Leaveavailable=this.Leaveavailable-noofdays;
		if(Leaveavailable<0)//if leaves goes below 0 then if throws exception
		{
			throw new NoLeaveAvailableException("No leaves available");
		}
		else
		{
			System.out.println("Leaves avaiable after this "+this.Leaveavailable);
		}
	}
	//Method for calculating salary
	@Override
	double calsal(double basicpay)
	{
		double HRA=0.18*basicpay;
		double sal=basicpay+HRA;
		return sal;
	}
	@Override
	public String toString() {
		return "staff [empid=" + EmpId + ", empname=" + EmpName + "]";
	}
}
