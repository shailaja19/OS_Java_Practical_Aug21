package com.sonata.PracticalTest;

public class UsingPeople {

	public static void main(String[] args) throws NoLeaveAvailableException{
		
		Address a1 = new Address();
		a1.setCity("Jamshedpur");
		a1.setDoorno(5);
		a1.setPincode(100210);
		a1.setStreet("Central Street");
		TechnicalEmp t1 = new TechnicalEmp(1317, "Ankur", 40000, 25,"Java",  a1);
		t1.applyLeave(10);
		t1.calsal();
		System.out.println(t1);
		t1.display();
		t1.displayLeave();
		
		System.out.println();
		Address a2 = new Address();
		a2.setCity("Mumbai");
		a2.setStreet("Second Street");
		a2.setDoorno(21);
		a2.setPincode(400201);
		Staff s1 = new Staff(2912, "ABC", 25000, 20, "House-keeping", a2);
		s1.applyLeave(9);
		s1.calsal();
		System.out.println(s1);
		s1.display();
		s1.displayLeave();
		
		System.out.println();
		Address a3 = new Address();
		a3.setCity("Delhi");
		a3.setStreet("MG Road");
		a3.setDoorno(13);
		a3.setPincode(100101);
		TechnicalEmp t2 = new TechnicalEmp(4391,"XYZ",33000, 25,"C++", a3);
		System.out.println(t2);
		t2.calsal();
		t2.display();
		t2.applyLeave(25);
		t2.displayLeave();

	}

}
