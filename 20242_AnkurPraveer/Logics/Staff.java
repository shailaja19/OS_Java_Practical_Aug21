package com.sonata.PracticalTest;

//Staff class inherits Employee as parent class.
public class Staff extends Employee{
	
	// Staff-specific attributes
	private String title;
	double sal;
	int dayAvailable;
	
	// Constructor for subclass Staff inherits parent class attributes and Address object.
	
	public Staff (int a,String b,double c,int d,String e,Address x)
	{
		super(a,b,c,d);
		this.title=e;
		this.adr=x;
	}
	
	// calsal method overrides parent class method to return calculated salary.
	@Override
	public double calsal() {
		// Calculating Salary as basic + hra where hra is 18% i.e 0.18*basic.
		sal = basic + basic*0.18;
		return (sal);
	}
	
	// applyLeave method overrides parent class method to calculate and return available leaves or throw error if exception occurs.
	@Override
	public int applyLeave(int q) throws NoLeaveAvailableException {
		//If requested days equals available leaves , NoLeave exception is thrown.
		if( leaves -q ==0)
			throw new NoLeaveAvailableException("Leaves not Available");
		else if(leaves - q>0)
		{
			dayAvailable = leaves-q;
			return (leaves-q);
		}
		else
			return 0;
	}
	
	// toString() method to display empId,empName and title;
	@Override
	public String toString() {
		return "Staff [title=" + title + ", empId=" + empId + ", empName=" + empName + "]";
	}
	
	// display method shows calculated salary ,number of available leaves if any and address of the employee.
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
