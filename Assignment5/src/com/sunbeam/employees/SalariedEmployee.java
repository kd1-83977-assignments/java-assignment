package com.sunbeam.employees;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee() {

	}
	

	public SalariedEmployee(String firstname, String lastname, double weeklySalary) {
		super(firstname, lastname);
		this.weeklySalary=weeklySalary;
		
	}
	

	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Weekly Salary is :");
		weeklySalary=sc.nextDouble();	
	}
	public void display() {
		super.display();
//		System.out.println("Weekly Salary is -"+weeklySalary);
		
	}


	@Override
	public void calculateTotalSalary() {
		double d = getWeeklySalary();
		System.out.println("Salary is -"+(d));
	}
	
	
	

}
