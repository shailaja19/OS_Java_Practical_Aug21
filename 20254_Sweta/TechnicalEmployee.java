package com.sonata;

public class TechnicalEmployee extends Employee {
	//declaring the technical employee attributes
	String skill;
	TechnicalEmployee(int id, String name, Address add,double salary, int leave,String skill) {
		super(id, name, add, salary, leave);
		this.skill=skill;
	}
	//method calculateSalary for the TechnicalEmployee class to calculate their salary
	double calculateSalary() {
		double HRA = (this.salary*0.12);
		this.salary=this.salary+HRA;
		return this.salary;
	}
	//creating a method applyLeave to calculate the leaves available 
	// throw and exception when the leave available is 0 or less than 0
	void applyLeave(int days)throws NoLeaveAvailableException {
		if(this.leaves==0 || this.leaves<0) {
			throw new NoLeaveAvailableException("No Leaves available");
		}
		else
			{
			//printing the value of remaining leaves after granting
			this.leaves=this.leaves-days;
			if(this.leaves>0){
		System.out.println("Leave granted\nRemaining leaves "+ this.leaves);
			}
			else {
				System.out.println("Exhausted Leaves");
			}
			}
	}
	//toString method to display the name and ID of technical employees
	public String toString() {

		return "Technical Employee ID: " + eid +"\n" + "Employee name:" + ename;
	}
	
	
}
