package com.sonata.software;

public class UsingPeople {

	public static void main(String[] args) throws MyOwnException {
		
		
		//address attributes
		Address a1=new Address(26,"dbg","darbhanga",846001);
		Address a2=new Address(29,"lbh","patna",842666);
		Address a3=new Address(45,"sms","samastipur",848209);
		// created two object of staff class and one object of technical employee class
		Staff s1=new Staff();
		Staff s2=new Staff();
		TechnicalEmployee t1=new TechnicalEmployee();
		//adding the value to staff attributes
		s1.setAddr(a1);
		s1.setEmpid(123);
		s1.setEmpname("kishan");
		s1.setNoofleaves(15);
		s1.setBasicpay(40000);
		s1.title="House Keeping";
		System.out.println(s1.toString()); //displaying the staff s1 name and id
		s2.setAddr(a2);
		s2.setEmpid(1234);
		s2.setEmpname("kishanroy");
		s2.setNoofleaves(20);
		s2.setBasicpay(30000);
		s2.title="security";
		System.out.println(s2.toString()); //displaying the staff s2 name and id
		
		// adding the value to technical employee attributes
		t1.setAddr(a3);
		t1.setEmpid(345);
		t1.setEmpname("kroy");
		t1.setNoofleaves(25);
		t1.setBasicpay(60000);
		t1.technicalskills="c++";
		System.out.println(t1.toString()); //displaying the technical employee t1 name and id
		
		
		//Staff s1 Applying leave 
		System.out.println("staff s1 applying leave: ");
		s1.applyLeave(15);
		
		//staff s2 applying leave
		
		System.out.println("Technical employee applying leave: ");
		t1.applyLeave(5);
		
		System.out.print("Calculating total salary of staff s2: ");
		System.out.println(s2.CalculateSalary());
		
		System.out.print("Calculating total salary of technical employee t1: ");
		System.out.println(t1.CalculateSalary());
		
		System.out.println("Staff s1 again applying leave: ");
		
		s1.applyLeave(10);
		
		
		
		
		
		
		

	}

}
