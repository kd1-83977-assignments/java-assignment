package com.sunbeam.employees;

import java.util.Scanner;

public abstract class Employee {
	private String firstname;
	private String lastname;
	
	private final int SSN = ++increamentSSN;
	
	private static int increamentSSN=1000;
	
	
	public Employee() {
			
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static int getIncreamentSSN() {
		return increamentSSN;
	}

	public static void setIncreamentSSN(int increamentSSN) {
		Employee.increamentSSN = increamentSSN;
	}

	public int getSSN() {
		return SSN;
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void accept(Scanner sc) {
		System.out.println("enter Firstname -");
		firstname=sc.next();
		System.out.println("Enter lastname -");
		lastname=sc.next();
	}
	public void display() {
//		System.out.println("Firstname is -"+firstname);
//		System.out.println("Lastname is -"+lastname);
		System.out.println(SSN);
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Employee [Name=" + firstname + " "+ lastname + "]";
	}
	public abstract void calculateTotalSalary(); // 100% incomplete
}


