package com.sonata.MainClass;


import com.sonata.PracticalTest.Address;
import com.sonata.PracticalTest.NoLeaveAvailableException;
import com.sonata.PracticalTest.Staff;
import com.sonata.PracticalTest.TechnicalEmp;

//Main Method
public class UsingPeople {

	public static void main(String[] args) throws NoLeaveAvailableException{
		// Setting an address and creating a new object for TechnicalEmp class.
				Address a1 = new Address();
				a1.setCity("Jamshedpur");
				a1.setDoorno(5);
				a1.setPincode(100210);
				a1.setStreet("Central Street");
				TechnicalEmp t1 = new TechnicalEmp(1317, "Ankur", 40000, 25,"Java",  a1);
				// Applying salcal() to calculate salary and applyleave() to calculate available leaves.
				t1.applyLeave(10);
				t1.calsal();
				
				// Displaying details of the TechnicalEmp
				System.out.println(t1);
				t1.display();
				t1.displayLeave();
				
				// Line-space
				System.out.println();
				
				// Setting an address and creating a new object for Staff class.
				Address a2 = new Address();
				a2.setCity("Mumbai");
				a2.setStreet("Second Street");
				a2.setDoorno(21);
				a2.setPincode(400201);
				Staff s1 = new Staff(2912, "ABC", 25000, 20, "House-keeping", a2);
				// Applying salcal() to calculate salary and applyleave() to calculate available leaves.
				s1.applyLeave(9);
				s1.calsal();
				// Displaying details of the Staff
				System.out.println(s1);
				s1.display();
				s1.displayLeave();
				
				//Line-space
				System.out.println();
				
				// Setting an address and creating a new object for Staff class.
				Address a3 = new Address();
				a3.setCity("Delhi");
				a3.setStreet("MG Road");
				a3.setDoorno(13);
				a3.setPincode(100101);
				TechnicalEmp t2 = new TechnicalEmp(4391,"XYZ",33000, 25,"C++", a3);
				// Displaying details of the Staff
				System.out.println(t2);
				t2.calsal();
				t2.display();
				// NoLeaceAvailableException occurs as required leaves(25) = available leaves(25)
				t2.applyLeave(25);
				t2.displayLeave();

	}

}
