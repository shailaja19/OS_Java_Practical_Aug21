package com.sonata.Employeedetails;

public class UsingPeople {

	public static void main(String[] args) throws NoLeaveAvailableException
	{
		
		TechnicalEmployee t=new TechnicalEmployee(5,"aashrith",600000,20,"Java");
		//address obj is created and values are assigned.
		Address obj=new Address("22-2-13","Nellore",524003,"Balajinagar");
		t.setObj(obj);
		System.out.println(t);
		System.out.println(t.obj);
		t.applyLeave(2);
		//Object for staff is created
		Staff s=new Staff(5,"Aashrith",600000,20,"Java");
		System.out.println(s);
		s.applyLeave(2);

	}

}
