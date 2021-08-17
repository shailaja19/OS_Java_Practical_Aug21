package com.sonata.software;

public abstract class Employee {
	
	// specifiying the attributes
	int empid;
	String empname;
	double basicpay;
	int noofleaves;
	Address addr; //implemented from address class
	
	//implementing getter setter
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	public int getNoofleaves() {
		return noofleaves;
	}

	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
     //creating two abstract method
	abstract double CalculateSalary();
	abstract void applyLeave(int days) throws MyOwnException;
	
	//created toString method for displaying all the attributes
	@Override
	public String toString() {
		return "Staff [empid=" + empid + ", empname=" + empname + ", basicpay=" + basicpay + ", noofleaves="
				+ noofleaves + ", addr=" + addr.doorno+","+addr.street+","+addr.city +","+addr.pincode+ ", CalculateSalary()=" + CalculateSalary() + "]";
	}
	
	

}
