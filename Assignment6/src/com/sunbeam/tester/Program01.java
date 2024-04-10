package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.enitity.StringLen;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Program01 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	
	StringLen l= new StringLen();
	try {
		System.out.println("Enter The String -");
		String s=sc.nextLine();
		int a =s.length();
		l.setString(s);
		System.out.println(a);
		
	} 
	catch (ExceptionLineTooLong e)
	{

		e.printStackTrace();
	}finally
	{
		System.out.println("In finally block");
		sc.close();
	}
	
	}

}
