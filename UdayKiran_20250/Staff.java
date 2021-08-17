package com.sonata.Test;

public class Staff extends Employee{
	//subclass Staff extends superclass Employee
	
	String title;
	
	Staff(int empid,String ename,double basicpay,int leavesavailable,String title){
		//Staff constructor helps to initialize values from main method using Staff instance 
		super(empid,ename,basicpay,leavesavailable);
		this.title = title;
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
	double calsal(double salary){//calsal method that returns salary after adding 18% to the basicpay
		this.basicpay = salary;
		salary = basicpay + (0.18*basicpay);//Given formula
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
	
	public static void main(String args[]) throws MyOwnException{
		Staff s1=new Staff(01,"uday",60000,10,"Manager");
		s1.calsal(60000);
		s1.applyLeave(20);
		System.out.print(s1);
		
	}
	
	
	@Override
	public String toString() {
		//overriding toString() method to display ename and empid
		return "Staff [empid=" + empid + ", ename=" + ename + "]";
	}
	
	
}	
