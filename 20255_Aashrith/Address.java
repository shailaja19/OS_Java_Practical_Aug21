package com.sonata.Employeedetails;
public class Address 
{
        private	String doorno;
		private String city;
		private int pincode;
		private String street;
        // Creating Constructor for Address class          
		Address(String doorno,String city,int pincode,String street)
		{
			this.city=city;
			this.doorno=doorno;
			this.pincode=pincode;
			this.street=street;
		}
		@Override
		public String toString() {
			return "Address [doorno=" + doorno + ", city=" + city + ", pincode=" + pincode + ", street=" + street + "]";
		}
		
		
}

