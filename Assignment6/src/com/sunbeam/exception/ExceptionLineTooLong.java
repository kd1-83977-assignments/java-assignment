package com.sunbeam.exception;

public class ExceptionLineTooLong extends Exception{
	String message ="";
	
	public ExceptionLineTooLong() {
		this.message="The Strings is too long";

		
	}
	
	public ExceptionLineTooLong(String message) {
		this.message="The Strings is too long";

	}
	
	@Override
	public String toString() {
		return message;
	}
	
	
	
	
	

}
