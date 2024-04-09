package com.sunbeam.employees;

import java.util.Scanner;

public class HourlyEmp extends Employee{
	
	private double hourly_wage;
	private double hours;
	
	public HourlyEmp() {

	}
	
	public HourlyEmp(String firstname, String lastname,double hourly_wage, double hours) {
		super(firstname, lastname);
		this.hourly_wage=hourly_wage;
		this.hours=hours;

	}

	public void accept(Scanner sc) {
		super.accept(sc);
		
		System.out.println("Enter hourly wage for Emp -");
		hourly_wage=sc.nextDouble();
		System.out.println("Enter total hours worked");
		hours=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		//System.out.println("Salary of employee is "+hourly_wage*hours);
		//this.calculateTotalSalary();
		
	}
	
	@Override
	public void calculateTotalSalary() {
		double d;
		if(hours<=40) {
			d=hourly_wage*hours;
			System.out.println("Salary of employee is - "+d);
			
		}else if(hours >40) {
			d= (40*hourly_wage)+((hours-40)*hourly_wage*1.5);
			System.out.println("Salary of employee is - "+d);

			
		}
		
		
		
	}

}
