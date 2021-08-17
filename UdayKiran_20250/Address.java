package com.sonata.Test;

public class Address {
	String doorNo;
	String street;
	String city;
	String pincode;//Initializing attributes
	Address(String doorNo,String street,String city,String pincode){
		//Address constructor helps to initialize values from main method using Address instance 
		this.doorNo=doorNo;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}
}
