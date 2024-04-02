import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int choice;
		int bill =0;
		
		do{
			System.out.println("menu : ");
			System.out.println("1 to buy Dosa : 100rs");
			System.out.println("2 to buy Samosa: 50rs ");
			System.out.println("3 to buy Idli : 40rs");
			System.out.println("4 to display the bill");
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
