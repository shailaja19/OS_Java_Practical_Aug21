package com.sonata.PracticalTest;

public class Address {
	private int doorno;
	private String Street;
	private String city;
	private int pincode;
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", Street=" + Street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
