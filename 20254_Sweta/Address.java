package com.sonata;

public class Address {
	//declaring the address attributes
	String dno;
	String street;
	String city;
	int pin;
	//creating address constraints
	Address(String dno,String street,String city,int pin){
		this.dno=dno;
		this.street=street;
		this.city=city;
		this.pin=pin;
	}
}

