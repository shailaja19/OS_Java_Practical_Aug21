package com.sonata;

public class NoLeaveAvailableException extends Exception{
	//creating an exception when leaves are exhausted
	public  NoLeaveAvailableException(String e) {
		super(e);
	}

}
