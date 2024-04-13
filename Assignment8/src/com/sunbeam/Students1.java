package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Students1{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students1() {
		// TODO Auto-generated constructor stub
	}
	
	public Students1(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll +" "+ name+" "+city+" "+marks;
	}
	

	public static void main(String[] args) {
		

		Students1 arr[]= new Students1[4];
		arr[0]=new Students1(1,"vedant","pune",70);
		arr[1]=new Students1(4,"rohit","satara",80);
		arr[2]=new Students1(2,"monu","mumbai",60);
		arr[3]=new Students1(7,"hritik","nagar",90);
		
		
		
		class Students1NameComparator implements Comparator<Students1> {

			@Override
			public int compare(Students1 o1, Students1 o2) {
				int value = o1.name.compareTo(o2.name);
				return value;
				
			}
			}
		class Students1CityComparator implements Comparator<Students1> {

			@Override
			public int compare(Students1 o1, Students1 o2) {
				int value = o1.city.compareTo(o2.city);
				return value;
				
			}
			}
		class Students1MarksComparator implements Comparator<Students1> {

			@Override
			public int compare(Students1 o1, Students1 o2) {
				int value = Double.compare(o1.marks, o2.marks);
				return value;
				
			}
			}
		
		
		System.out.println("Before Sorting -");
		for (Students1 stud : arr) 
		{
			System.out.println("Student Details -"+stud);
		}
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("0 to exit");
			System.out.println("1 to sort on city");
			System.out.println("2 to sort on marks");
			System.out.println("3 to sort on name");
			
			System.out.println("Enter your choice");
			
			choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you...");
				
				break;
			case 1:
				Comparator<Students1>  nref = new Students1CityComparator();
				
				Arrays.sort(arr,nref);
				
				for (Students1 stud : arr)
					System.out.println(stud);
							
				break;
			case 2:
				Comparator<Students1>  mref = new Students1MarksComparator();
				
				Arrays.sort(arr,mref);
				
				for (Students1 stud : arr)
					System.out.println(stud);
							
				
				break;
			case 3:
				Comparator<Students1>  naref = new Students1NameComparator();
				
				Arrays.sort(arr,naref);
				
				for (Students1 stud : arr)
					System.out.println(stud);
							
				break;

			default:
				break;
			}	
			
		}while(choice !=0);
		
		}	
		
	}

