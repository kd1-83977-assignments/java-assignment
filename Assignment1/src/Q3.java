import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int choice;
		int bill =0;
		
		do{
			System.out.println("Menu : ");
			System.out.println("1 to buy Dosa : 100rs");
			System.out.println("2 to buy Samosa: 50rs ");
			System.out.println("3 to buy Idli : 40rs");
			System.out.println("4 to buy Vada pav : 30rs");
			System.out.println("5 to buy Bhaji: 50rs ");
			System.out.println("6 to buy Cold drink : 40rs");
			System.out.println("7 to buy Pani puri : 30rs");
			System.out.println("8 to buy Bhel: 50rs ");
			System.out.println("9 to buy Pohe : 30rs");
			System.out.println("10 to buy Upma : 30rs");

			System.out.println("11 to display the bill");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			choice= sc.nextInt();
			
		switch(choice) {
			case 1:
				System.out.println("ordered Dosa");
				bill +=100;
				break;
			case 2:
				System.out.println("ordered Samosa");
				bill +=50;
				break;
			case 3:
				System.out.println("ordered Idli");
				bill +=40;
				break;
			case 4:
				System.out.println("ordered Vada pav");
				bill +=30;
				break;
			case 5:
				System.out.println("ordered Bhaji");
				bill +=50;
				break;
			case 6:
				System.out.println("ordered Cold drink");
				bill +=40;
				break;
				
			case 7:
				System.out.println("ordered Pani puri");
				bill +=30;
				break;
			case 8:
				System.out.println("ordered Bhel");
				bill +=50;
				break;
			case 9:
				System.out.println("ordered Pohe");
				bill +=30;
				break;
			case 10:
				System.out.println("ordered Upma");
				bill +=30;
				break;
			case 11:
				System.out.println("total bill is "+bill);
				break;
			case 0:
				System.out.println("thank youuu..");
				break;
			default:
				System.out.println("wrong choice");
				break;	
			
		}
		}while(choice != 0);
				

	}

}
