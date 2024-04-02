import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 double values");
		
		if(sc.hasNextDouble()) {
			
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			

			double num3=num1+num2;
			System.out.println("Average is "+((num1+num2)/2));
			
			
		}
		else {
			System.out.println("please enter Double value");
		}
		
	

	}

}
