package com.sunbeam.fruits;

import java.util.Scanner;

public class Apple extends Fruit{

	public Apple() {
		super();
		
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh= true);
		
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
	}
	
	public void display() {
		super.display();
	}
	
	@Override
	public String toString() {
		return "Name -"+ getName() + "weight -"+ getWeight() + "Color "+ getColor(); 
	}
	
	public String taste() {
		return "sweet n sour";
	}
	
	

}
