package com.sonata.main;

//Creation of UsingPeople class to implement the main() method
import com.sonata.practical.Address;
import com.sonata.practical.Staff;
import com.sonata.practical.TechnicalEmployee;//importing the classes as they are from different package

public class UsingPeople {

	public static void main(String[] args) {
		// creating an instance of TechnicalEmployee class and passing the parameters
		// through constructor

		System.out.println("\n-----------Technical Employee 1-----------");
		//TechnicalEmployee t = new TechnicalEmployee(int empid,String empName,Address addr,double
		// basicpay,int noleaves,String skills)
		TechnicalEmployee t1 = new TechnicalEmployee(123, "chakri",
				new Address("17/13/7", "krishna nagar", "RJY", "533101"), 30000d, 5, "c,c++,Java");

		System.out.println(t1);// toString() result will be printed as it is overridden

		// calculateSalary() method is called here
		System.out.println("Technical Employee salary:" + t1.calculateSalary());

		// applyLeave(int leavesApplied) method is called here
		t1.applyLeave(3);

		
		
		
		// -----------------------------------------------------------------------------//

		System.out.println("\n-----------Technical Employee 2-----------");
		
		TechnicalEmployee t2 = new TechnicalEmployee(234, "chakradhar",
				new Address("17/15/7", "Aryapuram", "RJY", "533104"), 50000d, 2, "Java,Python");

		System.out.println(t2);// toString() result will be printed as it is overridden

		// calculateSalary() method is called here
		System.out.println("Technical Employee salary:" + t2.calculateSalary());

		// applyLeave(int leavesApplied) method is called here
		t2.applyLeave(3);

		
		
		
		// creating an instance of Staff class and passing the parameters through
		// constructor
		System.out.println("\n-----------Staff 1-----------");

		//Staff s = new Staff(int empid,String empName,Address addr,double
		// basicpay,int noleaves,String title)
		
		Staff s1 = new Staff(234, "prudhvi", new Address("3/14/7", "Vinayaka nagar", "VJA", "522101"), 25000d, 10,
				"House Keeping");

		System.out.println(s1);// toString() result will be printed as it is overridden

		// calculateSalary() method is called here
		System.out.println("Staff salary:" + s1.calculateSalary());

		// applyLeave(int leavesApplied) method is called here
		s1.applyLeave(7);
		
		
		
		
		
		System.out.println("\n-----------Staff 2-----------");

		//Staff s = new Staff(int empid,String empName,Address addr,double
		// basicpay,int noleaves,String title)
		
		Staff s2 = new Staff(345, "chandra", new Address("13/4/7", "Lalitha Nagar", "RJY", "533105"), 10000d, 0,
				"Security");

		System.out.println(s2);// toString() result will be printed as it is overridden

		// calculateSalary() method is called here
		System.out.println("Staff salary:" + s2.calculateSalary());

		// applyLeave(int leavesApplied) method is called here
		s2.applyLeave(7);
	}

}
