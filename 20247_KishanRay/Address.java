package com.sonata.software;

public class Address {
	
	//created attributes
	int doorno;
	String street;
	String city;
	int pincode;
	
	Address(){}; //empty constructor
	Address(int doorno,String street,String city,int pincode){
		this.doorno=doorno;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}//Parameterized constructor

}
