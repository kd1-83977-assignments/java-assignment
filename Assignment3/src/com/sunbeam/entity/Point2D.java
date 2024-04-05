package com.sunbeam.entity;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	String getDetails() {
		String details;
		details = x+", "+y;
		return details;
	}
	public boolean isEqual(Point2D a1, Point2D a2) {
		if(a1.x == a2.x && a1.y == a2.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void calculateDistance(Point2D a1, Point2D a2) {
		double dist = Math.sqrt( Math.pow(a1.x - a2.x,2 ) +Math.pow(a1.y - a2.y, 2));
		
		System.out.println("Distance is : "+dist);
		
	}
	
	public void accept() {
		System.out.println("enter value of x: ");
		Scanner sc = new Scanner(System.in);
		
		x=sc.nextInt();
		
		System.out.println("enter value of y: ");
		y=sc.nextInt();
		
	}
	public void display() {
		System.out.println(getDetails());
	}
	
	
}
