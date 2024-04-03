package com.assign;

import java.util.Scanner;

public class Invoice {
	private String prt_num;
	private String prt_desc;
	private int itm;
	private double price;
	
	
	public Invoice() {
		
	}
	public Invoice(String prt_num, String prt_desc, int itm, double price) {
		super();
		this.prt_num = prt_num;
		this.prt_desc = prt_desc;
		this.itm = itm;
		this.price = price;
	}
	public void setPrt_num(String prt_num) {
		this.prt_num=prt_num;
	}
	public String getPrt_num(){
		return prt_num;
	}
	public String getPrt_desc() {
		return prt_desc;
	}
	public void setPrt_desc(String prt_desc) {
		this.prt_desc = prt_desc;
	}
	public int getItm() {
		return itm;
	}
	public void setItm(int itm) {
		this.itm = itm;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the part number");
		prt_num=sc.next();
		System.out.println("enter the part details");
		prt_desc= sc.next();
	
		System.out.println("enter the quantity/quantities to buy");
		itm=sc.nextInt();
		
		System.out.println("enter the part Price");
		price=sc.nextDouble();
		
		
	}
	public void calculateTotal() {
		if(getItm()<0) {
			setItm(0);
		}
		if(getPrice()<0.0) {
			setPrice(0.0);
		}
		double total= price*itm;
		System.out.println(total);
		
	}
	
	public void display() {
		System.out.print("total is  ");
		double total= price*itm;
		System.out.println(total);
	}
	
}
