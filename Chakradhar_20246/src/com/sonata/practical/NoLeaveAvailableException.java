package com.sonata.practical;

//Creation of the NoLeaveAvailableException class
public class NoLeaveAvailableException extends Exception {
	String s;

	public NoLeaveAvailableException(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}
