package com.sunbeam.fruits;

import java.util.Scanner;

public class Fruit {
	 String color;
	 String name;
	 double weight;
	 boolean isFresh;
	
	public Fruit() {
		
	}

	public Fruit(String color, double weight,String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
		this.name=name;
	}
	
	public void accept(Scanner sc) {
		System.out.println("enter name -");
		name= sc.next();
		System.out.println("enter color -");
		color=sc.next();
		System.out.println("enter weight -");
		weight=sc.nextDouble();
		System.out.println("fruit is fresh(true or false");
		isFresh=sc.nextBoolean();
	}
	
	public void display() {
		System.out.println("name "+ name);
		System.out.println("color "+ color);
		System.out.println("weight "+ weight);
		System.out.println("is fruit fresh "+ isFresh);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	@Override
	public String toString() {
		return "Name -"+name + "weight -"+weight + "Color "+color; 
	}
	
	public String taste() {
		return "no specific taste ";
	}
	
	
	

}
