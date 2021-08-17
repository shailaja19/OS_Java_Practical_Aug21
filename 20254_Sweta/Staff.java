package com.sonata;

public class Staff extends Employee{
	//declaring the staff attributes
	String title;
	Staff(int id,String name,Address add,double salary,int leave,String title)
	{
		super(id,name,add,salary,leave);
		this.title=title;
	}
	//method calculateSalary for the staff class to calculate their salary
	double calculateSalary()
	{
		double HRA = (0.18*salary);
		this.salary = salary + HRA ;
		return this.salary;
	}
	//creating a method applyLeave to calculate the leaves available 
	// throw and exception when the leave is 0 or less than 0
	void applyLeave(int days) throws NoLeaveAvailableException  {
		if(this.leaves==0 || this.leaves<0)
		{
			throw new NoLeaveAvailableException("No Leaves available");
			
		}
		else
		{this.leaves=this.leaves-days;
		//printing the value of remaining leaves after granting
	System.out.println("Leave granted\nRemaining leaves "+ this.leaves);}
	}

	//toString method to display the name and ID of staff
	public String toString() {
		return "Staff Employee ID: " + eid +"\n" + "Employee Name:" + ename;
	}
	
	

}	
