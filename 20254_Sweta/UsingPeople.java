package com.sonata;

public class UsingPeople {
	public static void main(String[] args) throws NoLeaveAvailableException {
		//creating instances for technical employees and staff
		TechnicalEmployee TE1 = new TechnicalEmployee(100,"Sweta",new Address("1-62/1","2ND","VJY",521106),
				10000,10,"C++");
		TechnicalEmployee TE2 = new TechnicalEmployee(101,"Sumanth",new Address("1-62/4","3RD","VJY",520004),
				10000,20,"C++");
		Staff S1 = new Staff(104,"ABC",new Address("1-62/1","2ND","VJY",521108),
				10000,30,"housekeeping");
		Staff S2 = new Staff(102,"XYZ",new Address("1-62/1","3RD","BLR",521104),
				10000,25,"guard");
		
		//printing the employee and staff details
		//calculating the salary using calculateSalary() method
		System.out.println(TE1.toString());
		System.out.println("Salary= "+TE1.calculateSalary());
		TE1.applyLeave(8);
		System.out.println(TE2.toString());
		System.out.println("Salary= "+TE2.calculateSalary());
		TE2.applyLeave(15);
		System.out.println(S1.toString());
		System.out.println("Salary= "+S1.calculateSalary());
		S1.applyLeave(30);
		System.out.println(S2.toString());
		System.out.println("Salary= "+S2.calculateSalary());
		S2.applyLeave(25);
		//applying leave after leaves are exhausted
		S2.applyLeave(6);

		
		
	}

}