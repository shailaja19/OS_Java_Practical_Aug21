package com.sonata.Test;

public class TechnicalEmployee extends Employee {
	//TechnicalEmployee extends Employee class
	
	String skill;
	
	TechnicalEmployee(int empid, String ename, double basicpay, int leavesavailable,String skill) {
		//TechnicalEmployee constructor helps to initialize values from main method using TechnicalEmployee instance 
		super(empid, ename, basicpay, leavesavailable);
		this.skill = skill;
		//Used super keyword to call or access the parent class constructor
	}

	
	public Address getObj() {
		
		return obj;
	}
	
	public Address setObj(Address obj) {
		this.obj = obj;
		return obj;
	}
	@Override
	double calsal(double salary) {//overrides calsal methods and calculates sal for 12%
		this.basicpay = salary;
		salary = basicpay + (basicpay*0.12);
		return salary;
	}
	
	@Override
	void applyLeave(int noofdays) throws MyOwnException
	{
		int i1=this.leavesavailable-noofdays;
		if(i1<0){
			throw new MyOwnException("No leaves available");
		}
		else{
			System.out.println("No.of leaves available"+this.leavesavailable);
		}
	}

	@Override
	public String toString() {
		//overriding toString() method to display ename and empid
		return "TechnicalEmployee [empid=" + empid + ", ename=" + ename + "]";
	}
	
	public static void main(String[] args) throws MyOwnException {
		//Initializing instances of TechnicalEmplyee class
		TechnicalEmployee t1 = new TechnicalEmployee(100, "java", 1000.00,10,"java");
		t1.calsal(50000);
		t1.applyLeave(20);
	}
	
	

}

