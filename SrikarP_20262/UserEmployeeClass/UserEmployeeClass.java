package pt.UserEmployeeClass;


//importing 

import pt.EmployeeTS.Address;
import pt.EmployeeTS.NoLeavesAvailableException;
import pt.EmployeeTS.Staff;
import pt.EmployeeTS.TechnicalEmployee;

public class UserEmployeeClass {

	public static void main(String[] args) throws NoLeavesAvailableException {
		
//		objects declaration
		
		Address a1 = new Address(1,"sai","hyd",50098);
		a1.setObj(a1);
		Address a2 = new Address(2,"peer","wgl",500039);
		a2.setObj(a2);
		Address a3 = new Address(3,"par","hyd",500039);
		a3.setObj(a3);
		TechnicalEmployee t1 = new TechnicalEmployee(12,"srikar",a1,20000,12);
		TechnicalEmployee t2 = new TechnicalEmployee(13,"sai",a2,30000,10);
		TechnicalEmployee t3 = new TechnicalEmployee(14,"sri",a3,40000,0);
		Staff s1 = new Staff(15,"kar",a1,10000,9);
		s1.setTitle("delivery");
		Staff s2 = new Staff(16,"rick",a2,8000,3);
		s2.setTitle("security");
		Staff s3 = new Staff(17,"ram",a3,5000,2);
		
//		different method execution
		
		t1.CalcSal();
		s2.CalcSal();
		t1.ApplyLeave(12);
		s1.CalcSal();
		s1.ApplyLeave(6);
		System.out.println("No of leaves available are " + t1.getNoOfLeavesAvailable());
		System.out.println("No of leaves available are " + s1.getNoOfLeavesAvailable());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
//		After occuring exception it is not executing the instructions below that ma'am
		
		t1.ApplyLeave(113);
		t1.CalcSal();   /*after throwing exception it didnt execute t1.Calsal() ma'am*/  
		

	}

}
