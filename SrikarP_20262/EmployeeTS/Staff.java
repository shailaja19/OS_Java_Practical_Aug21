package pt.EmployeeTS;

//staff sub class of employee

public class Staff extends EmployeeTS {
	
//	attributes of Staff
	private String Title;

	public Staff(int empid, String empname, Address obj, double BasicPay, int NoOfLeavesAvailbale) {
		super(empid, empname, obj, BasicPay, NoOfLeavesAvailbale);
		
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@Override
	public String toString() {
		return "Staff [EmpID = " + getEmpId() + " EmpName = " + getEmpName() + " Title = " + Title +  "]";
	}

	@Override
	public void CalcSal() {
		double sal = getBasicPay() + getBasicPay()*0.18;
		System.out.println("Salary of Staff is : " + sal);
		
	}

//	apply leave overriding
	
	@Override
	public void ApplyLeave(int l) throws NoLeavesAvailableException {
		if(l<=getNoOfLeavesAvailable() && getNoOfLeavesAvailable()>0) {
			int s = getNoOfLeavesAvailable()-l;
			setNoOfLeavesAvailable(s);}
		else {
			throw new NoLeavesAvailableException("No leaves Availble");
		}

		
	}
	
	
}
