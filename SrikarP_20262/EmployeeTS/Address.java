package pt.EmployeeTS;

//Address instance of employee so extends

public class Address extends EmployeeTS {
	
//	attributes of address
	
	private int DoorNo;
	private String Street;
	private String City;
	private int Pincode;
	
//	super constructor

	public Address(int empid, String empname, Address obj, double basicpay, int leaves) {
		super(empid, empname, obj, basicpay, leaves);
		// TODO Auto-generated constructor stub
	}
	
	public Address(int doorno, String street, String city, int pincode){
		this.DoorNo=doorno;
		this.Street=street;
		this.City=city;
		this.Pincode=pincode;
	}

	@Override
	public void CalcSal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ApplyLeave(int l) {
		// TODO Auto-generated method stub
		
	}
	
	

}
