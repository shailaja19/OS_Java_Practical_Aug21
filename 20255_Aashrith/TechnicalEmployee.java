package com.sonata.Employeedetails;
public class TechnicalEmployee extends Employee //Employee class is inherited
{
	String Skill;
	//Constructor for TechnicalEmpoyee class
	TechnicalEmployee (int EmpId,String EmpName,double BasicPay,int Leaveavailable,String Skill)
	{
		super(EmpId,EmpName,BasicPay,Leaveavailable);
		this.Skill=Skill;
	}
	//Exception handling for throwing exception if days goes less than 0;
	//Implementing abstract methods
	void applyLeave(int noofdays) throws NoLeaveAvailableException
	{
		int l=this.Leaveavailable-noofdays;
		if(l<0)
		{
			throw new NoLeaveAvailableException("No leaves available");
		}
		else
		{
			System.out.println("Leaves avaiable after this "+this.Leaveavailable);
		}
	}
	//Implementing abstract methods
	@Override
	public double calsal(double basicpay)
	{
		double HRA=0.12*basicpay;
		double sal=basicpay+HRA;
		return sal;
	}
	public Address getObj() 
	{
		return obj;
	}
	@Override
	public String toString() {
		return "TechnicalEmployee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}
	public void setObj(Address obj) 
	{
		this.obj=obj;
		
	}
	
}
