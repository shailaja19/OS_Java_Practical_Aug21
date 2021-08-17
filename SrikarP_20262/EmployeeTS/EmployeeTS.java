// new package
package pt.EmployeeTS;
//Base class for all the employee attributes
public abstract class EmployeeTS {
//	defining attributes
	private int empId;
	private String empName;
	private Address obj;
	protected double BasicPay;
	protected int NoOfLeavesAvailable;
	
//	constructor
	EmployeeTS(int empid, String empname, Address obj, double basicpay, int leaves){
		this.empId=empid;
		this.empName=empname;
		this.obj=obj;
		this.BasicPay=basicpay;
		this.NoOfLeavesAvailable=leaves;
		
	}
	
//	Implicit constructor 
	EmployeeTS(){
		
	}
	
//	Getter Setter functions

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	public double getBasicPay() {
		return BasicPay;
	}

	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}

	public int getNoOfLeavesAvailable() {
		return NoOfLeavesAvailable;
	}

	public void setNoOfLeavesAvailable(int noOfLeavesAvailable) {
		NoOfLeavesAvailable = noOfLeavesAvailable;
	}

//	toString function
	
	@Override
	public String toString() {
		return "EmployeeTS [empId=" + empId + ", empName=" + empName + ", obj=" + obj + ", BasicPay=" + BasicPay
				+ ", NoOfLeavesAvailable=" + NoOfLeavesAvailable + ", getEmpId()=" + getEmpId() + ", getEmpName()="
				+ getEmpName() + ", getObj()=" + getObj() + ", getBasicPay()=" + getBasicPay()
				+ ", getNoOfLeavesAvailable()=" + getNoOfLeavesAvailable() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
//	abstract method for calculating salary
	
	public abstract void CalcSal();
	
//	abstract method for applyleave
//	for adding custom exception i added throws as it is abstraction
	
	public abstract void ApplyLeave(int l) throws NoLeavesAvailableException;
	
	
	

}
