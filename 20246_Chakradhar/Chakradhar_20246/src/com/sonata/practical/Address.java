package com.sonata.practical;

//creation of Address class to carry the address info
public class Address {
	private String doorNo;
	private String street;
	private String city;
	private String pincode;

	public Address(String doorNo, String street, String city, String pincode) { // constructor to set the values
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	// getters and setters
	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {// toString is implemented because it does not inherit the method from Employee
								// class
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
