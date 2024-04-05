package com.sunbeam.entity;

import java.util.Scanner;

public class Car {
	private int miles;
	private double petrol_price;
	private double avgGallon;
	private double p_fees;
	private double t_fees;

	public Car() {
		miles=0;
		petrol_price=0;
		avgGallon=0;
		p_fees=0;
		t_fees=0;
	}

	public Car(int miles, double petrol_price,double avgGallon, double p_fees, double t_fees) {
		super();
		this.miles = miles;
		this.petrol_price = petrol_price;
		this.avgGallon=avgGallon;
		this.p_fees = p_fees;
		this.t_fees = t_fees;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public double getPetrol_price() {
		return petrol_price;
	}

	public void setPetrol_price(double petrol_price) {
		this.petrol_price = petrol_price;
	}

	public double getP_fees() {
		return p_fees;
	}

	public void setP_fees(double p_fees) {
		this.p_fees = p_fees;
	}

	public double getT_fees() {
		return t_fees;
	}

	public void setT_fees(double t_fees) {
		this.t_fees = t_fees;
	}
	
	public double getAvgGallon() {
		return avgGallon;
	}

	public void setAvgGallon(double avgGallon) {
		this.avgGallon = avgGallon;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total miles driven per day");
		miles=sc.nextInt();
		System.out.println("Cost per gallon of gasoline");
		petrol_price=sc.nextDouble();
		System.out.println("Average miles per gallon");
		avgGallon=sc.nextDouble();
		System.out.println("Parking fees per day");
		p_fees=sc.nextDouble();
		System.out.println("Tolls per day");
		t_fees=sc.nextDouble();
	}
	
	public void calculateExpense() {
		System.out.print("Total expense per day is : ");
		double exp1 = miles/avgGallon;
		
		double exp2= exp1*petrol_price;
		
		double exp3= exp2 + p_fees + t_fees;
		
		System.out.println(exp3);
			
	}

}
