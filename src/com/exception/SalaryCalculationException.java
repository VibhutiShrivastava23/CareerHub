package com.exception;

public class SalaryCalculationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6998344274953006072L;
	private String message;
	
	public SalaryCalculationException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
