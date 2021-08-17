package com.sonata.Test;

public class UsingPeople {

	public static void main(String[] args) throws MyOwnException
	{
		
		TechnicalEmployee t1= new TechnicalEmployee(01,"uday",600000.00,20,"Java");
		Staff s1= new Staff(01,"uday",600000.00,20,"Java");
		Address obj = new Address("70-10-04","santhi nagar","Vijayawada","520010");
		s1.applyLeave(2);
		
		t1.setObj(obj);
		System.out.println(t1.getObj());
		System.out.println(s1);
		

	}

}
