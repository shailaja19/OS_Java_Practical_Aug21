package com.sonata.PracticalTest;

//TechnicalEmp class inherits Employee as its parent class.
public class TechnicalEmp extends Employee{
	
	// Technical Employee-specific attributes
	private String skill;
	double sal;
	int dayAvailable;
	
	// Constructor for subclass TechnicalEmp inherits parent class attributes and Address object.
	public TechnicalEmp (int a,String b,double c,int d,String e,Address x)
	{
		super(a,b,c,d); // Getting employee details from parent class.
		this.skill=e;
		this.adr=x;
	}
	
	// calsal method overrides parent class method to return calculated salary.
	@Override
	public double calsal() {
		// Calculating Salary as basic + hra where hra is 12% i.e 0.12*basic
		sal = basic + 0.12*basic;
		return (sal); 
	}
	
	// applyLeave method overrides parent class method to calculate and return available leaves or throw error if exception occurs.
	@Override
	public int applyLeave(int q) throws NoLeaveAvailableException{
		// If requested days equals available leaves , NoLeave exception is thrown
		if (leaves-q ==0)
			throw new NoLeaveAvailableException("Leaves not Available");
		else if (leaves -q >0)
		{
			dayAvailable =leaves-q;
			return (leaves -q);
		}
		else
			return 0;
	}
	
	// toString() method to display empId,empName and skill;
	@Override
	public String toString() {
		return "TechnicalEmp [skill=" + skill + ", empId=" + empId + ", empName=" + empName + "]";
	}
	
	// display function shows calculated salary ,available Leaves if any and address of the employee.
	public void display()
	{
		System.out.println(adr);
		System.out.println("Calculated Monthly Salary = " + sal);
	}
	public void displayLeave()
	{
		System.out.println("No. of Available Leaves = " + dayAvailable);
		
	}
	

}
