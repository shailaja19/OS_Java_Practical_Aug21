package com.sonata.practical;

//Creation the TechnicalEmployee class
public class TechnicalEmployee extends Employee {

	private String skills;// defined the skills attribute as String
	// constructor to set the employee attributes with the arguments passed through
	// the TechnicalEmployee object

	public TechnicalEmployee(int empId, String empName, Address addr, double bpay, int leaves, String skills) {
		EmployeeId = empId;
		EmployeeName = empName;
		address = addr;
		BasicPay = bpay;
		noLeaves = leaves;
		this.skills = skills;
	}

	// implementation of the calculateSalary() method inherited from the Employee
	// class
	@Override
	public double calculateSalary() {
		double HRA = BasicPay * (12 * 0.01);
		double salary = BasicPay + HRA;
		return salary;
	}

	// implementation of the applyLeave() method inherited from the Employee class
	@Override
	public void applyLeave(int days) {
		try {
			if (noLeaves == 0) {
				// throwing NoLeaveAvailableException() if leaves available are 0
				throw new NoLeaveAvailableException("The number of leaves are currently 0");
			} else if (noLeaves < days) {
				// throwing NoLeaveAvailableException() if leaves applied are greater than
				// available
				throw new NoLeaveAvailableException(
						"The number of leaves applied are greater than the leaves available");
			} else {// leave is applied successfully if no exception
				noLeaves -= days;
				System.out.println("Leave applied successfully");
				System.out.println("Number of leaves available now are:" + noLeaves);
			}
		} catch (NoLeaveAvailableException e) {
			System.out.println(e);
		}
	}

}
