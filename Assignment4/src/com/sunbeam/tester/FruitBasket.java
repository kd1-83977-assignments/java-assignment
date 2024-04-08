package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		int index =0;
		System.out.println("enter basket size");
		size=sc.nextInt();
		Fruit []fruit= new Fruit[size];
		Fruit f;
		int choice;
		
		do {
			System.out.println(" Enter 0 to exit");
			System.out.println(" Enter 1 to Add Mango");
			System.out.println(" Enter 2 to Add Orange");
			System.out.println(" Enter 3 to Add Apple");
			System.out.println(" Enter 4 to Display all fruits in the basket");
			System.out.println(" Enter 5 to Display all fresh fruits in the basket");
			System.out.println(" Enter 6 to Display not fresh fruits");
			System.out.println(" Enter 7 to mark a fruit as Stale(not fresh");
			System.out.println(" Enter 8 to Mark all sour fruits");
			System.out.println(" Enter choice");
			choice=sc.nextInt();
			
			switch(choice) {
				case 0:
					System.out.println("Thank you.. ");
					break;
				case 1:
					if(index <size) {
					f = new Mango();
					f.accept(sc);
					fruit[index]=f;
					index++;
					}
					else {
						System.out.println("basket is full");
					}
					break;
					
				case 2:
					if(index <size) {
					f = new Orange();
					f.accept(sc);
					fruit[index]=f;
					index++;
					}
					else {
						System.out.println("basket is full");
					}
					break;
					
				case 3:
					if(index <size) {
					f = new Apple();
					f.accept(sc);
					fruit[index]=f;
					index++;
					}
					else {
						System.out.println("basket is full");
					}
					break;
				case 4:
					for(int i=0;i<index;i++) {
						fruit[i].display();
						fruit[i].taste();
					}
					//for(int element :fruits)
					break;
						
				case 5:
					
					for(int i=0;i<index;i++) {
						if(fruit[i].isFresh()== true) {
						fruit[i].display();
						fruit[i].taste();
					}
					}
					
					break;
					
				case 6:
					for(int i=0;i<index;i++) {
						if(fruit[i].isFresh()== false) {
						fruit[i].display();
						fruit[i].taste();
					}
					}
					
				case 7:
					int mark;
					System.out.println("Enter index to mark ");
					mark=sc.nextInt();
					if(mark<size) {
						for(int j=0;j<index;j++) {
							if( mark == j)
						fruit[j].setFresh(false);
						
					}
					}
					break;
					
				case 8:
					for(int k=0;k<index;k++) {
						
						if( fruit[k].taste()== "sour" ) {
							fruit[k].setFresh(false);
						}
						
					}
					break;
					
				default :
					System.out.println("wrong choice");
					break;
			}
			
			
			
			
		}while(choice !=0);
		

	}

}
