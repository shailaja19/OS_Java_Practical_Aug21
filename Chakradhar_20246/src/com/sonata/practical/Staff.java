package com.sonata.practical;

//creation of class Staff extending Employee
public class Staff extends Employee {
	private String title;

	// setting the attributes of the employee class using constructor
	public Staff(int empId, String empName, Address addr, double bpay, int leaves, String title) {
		EmployeeId = empId;
		EmployeeName = empName;
		address = addr;
		BasicPay = bpay;
		noLeaves = leaves;
		this.title = title;
	}

	// calculateSalary() method implementation
	@Override
	public double calculateSalary() {
		double HRA = BasicPay * (18 * 0.01);
		double salary = BasicPay + HRA;
		return salary;
	}

	@Override
	public void applyLeave(int days) {
		try {
			if (noLeaves == 0) {// if leaves available are 0 exception is thrown
				throw new NoLeaveAvailableException("The number of leaves are currently 0");
			} else if (noLeaves < days) {// if leaves available are less than the leaves applied exception is thrown
				throw new NoLeaveAvailableException(
						"The number of leaves applied are greater than the leaves available");
			} else {// leave applied successfully if no exception
				noLeaves -= days;
				System.out.println("Leave applied successfully");
				System.out.println("Number of leaves available now are:" + noLeaves);
			}
		} catch (NoLeaveAvailableException e) {
			System.out.println(e);
		}
	}

}
