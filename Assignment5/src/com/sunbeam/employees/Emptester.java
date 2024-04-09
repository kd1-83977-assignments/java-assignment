package com.sunbeam.employees;

import java.util.Scanner;

public class Emptester {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e;
		
		int choice;
		do {
			System.out.println("Enter 1 to create Salaried Employee");
			System.out.println("Enter 2 to create Hourly paid Employee");
			System.out.println("Enter 3 to create Commission Employee");
			System.out.println("Enter 4 to create Base salary+ Comm Employee");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				e= new SalariedEmployee();
				e.accept(sc);
				e.display();
				e.calculateTotalSalary();

				break;
			
		case 2:
			e= new HourlyEmp();
			e.accept(sc);
			e.display();
			e.calculateTotalSalary();
			break;
		
		case 3:
			e= new CommissionEmp();
			e.accept(sc);
			e.display();
			e.calculateTotalSalary();

			break;
	
		case 4:
			e= new BaseComm();
			e.accept(sc);
			if( e instanceof BaseComm) {
				BaseComm b =(BaseComm)e;
				b.display();
				b.rewardSalary();
			}
			break;
		}
			


	}while(choice !=0);

}
}