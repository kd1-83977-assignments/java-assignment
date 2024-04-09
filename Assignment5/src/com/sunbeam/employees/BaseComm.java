package com.sunbeam.employees;

import java.util.Scanner;

public class BaseComm extends CommissionEmp{
	
	private double baseSalary;
	
	public BaseComm() {
	
	}

	public BaseComm(String firstname, String lastname, double grossSales,double baseSalary, double commission) {
		super(firstname, lastname, grossSales, commission);
		this.baseSalary=baseSalary;
		
	}	
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base Salary -");
		baseSalary=sc.nextDouble();
		
	}
	
//	@Override
//	public void calculateTotalSalary() {
//		double d =baseSalary;
//		double d1=super.getGrossSales();
//		double d2= super.getCommission();
//		double d3=(d)+(d1*d2);
//		System.out.println("TotalSalary is -"+ ((d3)+(d3*0.1)));
//	}
//	
	public void rewardSalary() {
		double d =this.baseSalary;
		double d1=super.getGrossSales();
		double d2= super.getCommission();
		double d3=(d)+(d1*d2);
		System.out.println("TotalSalary is -"+ ((d3)+(d3*0.1)));
		
	}
	
	
	public void display() {
		super.display();
	}

	
}
