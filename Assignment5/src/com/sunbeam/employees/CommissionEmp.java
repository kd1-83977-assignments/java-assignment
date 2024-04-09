package com.sunbeam.employees;

import java.util.Scanner;

public class CommissionEmp extends Employee {
	private double grossSales;
	private double commission;
	
	public CommissionEmp() {

	}
	public CommissionEmp(String firstname, String lastname,double grossSales,double commission) {
		super(firstname, lastname);
		this.commission=commission;
		this.grossSales=grossSales;
		
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Gross Sales -");
		grossSales=sc.nextDouble();
		System.out.println("Enter Commission -");
		commission=sc.nextDouble();
	}
	
	@Override
	public void calculateTotalSalary() {
		double d = grossSales*commission;
		System.out.println("TotalSalary is -"+(d));

	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public void display(){
		super.display();
		//this.calculateTotalSalary();
		
	}
}
