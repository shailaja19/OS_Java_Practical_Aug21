package com.sonata.software;

import com.sonata.test.FunctionTest;

public class TechnicalEmployee extends Employee {
	
	// attribute title
	String technicalskills;
	
	//empty constructor
	TechnicalEmployee(){
		
	}
	// overriding the abstract method and using module function for calculating Technical employee salary
	@Override
	double CalculateSalary() {
    double hra=0.12*basicpay;
		
		return basicpay+hra;
	}
	
	//overriding the abstract method and using module function for leave calculation
void applyLeave(int days) throws MyOwnException {
		

	if(noofleaves-days<0) {
		System.out.println("Remaining leaves: "+noofleaves);
		throw new MyOwnException("NoLeaveAvailableException");
	}else {
		noofleaves-=days;
		System.out.println("Leave successfully apllied....");
		System.out.println("Available leaves: "+noofleaves);
	}
		
	}
//overriding the to string method to display only id and name of employee
@Override
public String toString() {
	return "TechnicalEmployee [empid=" + empid + ", empname=" + empname + "]";
}



}
