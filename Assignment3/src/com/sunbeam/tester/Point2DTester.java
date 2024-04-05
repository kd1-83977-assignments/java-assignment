package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.entity.Point2D; 

	public class Point2DTester {
		
		public static void main(String[] args) {
			
			System.out.println("enter the number of Points you want to enter ");
			
			int num;
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			//int i =0;			
			System.out.println("before while loop");
			
			Point2D[] points = new Point2D[num];
			
			for (int u=0;u< points.length;u++) {
				System.out.println("enter X value");
				int x = sc.nextInt();
				System.out.println("enter Y value");
				int y = sc.nextInt();
				points[u]=new Point2D(x,y);
			}
			
			int choice;
			
			do{
				System.out.println("Enter 1 to display specfic point");
				System.out.println("Enter 2 to display all points");
				System.out.println("Enter 3 to find distance between to specfic points");
				System.out.println("Enter 4 to Exit ");
				System.out.println("Enter choice ");
				choice=sc.nextInt();
				
				switch (choice) {
				case 1:
					int index;
					System.out.println("enter the index of Point");
					index=sc.nextInt();
					if (index>num) {
						System.out.println("Invail index, pls retry");
					}
					else
					
					points[index].display();
				
					break;
				case 2:

					for (Point2D point:points)
						point.display();
					
					break;
				case 3:
					
					System.out.println("enter 2 indices ");
					int i1;
					int i2;
					i1=sc.nextInt();
					i2=sc.nextInt();
					if ((i1 < num && i2 < num) && (i1>0 && i2 >0))
					if(points[i1].isEqual(points[i1], points[i2])) {
						System.out.println("Points are equal");
					}else {
						System.out.println("Points are not equal");
						
						points[i1].calculateDistance(points[i1], points[i2]);
					}
					
					break;
				case 4:
					System.out.println("Thank you.....");
					
					break;

				default:
					System.out.println("Wrong choice..");
					break;
				}
				
				
				
			}while(choice != 4);
			
		}
		
	}

