package com.sunbeam.enitity;

import com.sunbeam.exception.ExceptionLineTooLong;

public class StringLen {
	private String msg;
	 int len;
	

	public void setString(String s) throws ExceptionLineTooLong 
	{
		if(msg.length() >5) 
		{
			throw new ExceptionLineTooLong();
		}
			
		this.msg = msg;
		
	}

}
