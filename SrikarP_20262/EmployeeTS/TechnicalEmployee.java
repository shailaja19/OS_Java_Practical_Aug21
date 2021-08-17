package pt.EmployeeTS;

public class TechnicalEmployee extends EmployeeTS {
	
	private String Skill;
	
	public TechnicalEmployee(String skill){
		this.Skill=skill;
	}

	public TechnicalEmployee(int empid, String empname, Address obj, double BasicPay, int NoOfLeavesAvailbale) {
		super(empid, empname, obj, BasicPay, NoOfLeavesAvailbale);

	}

	@Override
	public String toString() {
		return "EmployeesTS [empID=" + getEmpId() + ", empName=" + getEmpName() + "]";
	}
	
//	

	@Override
	public void CalcSal() {
		double sal = getBasicPay() + getBasicPay()*0.12;
		System.out.println("Salary of Tech Employee is : "+ sal);
		
	}
	
//	apply leave with exception

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
