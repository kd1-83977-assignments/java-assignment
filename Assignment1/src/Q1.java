import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		
		num = sc.nextInt();
		
		String binaryNum = Integer.toBinaryString(num);
		
		String octalNum = Integer.toOctalString(num);
		String hecNum = Integer.toHexString(num);
		
		
		System.out.println("num is : "+ num);
		System.out.println("Binary of num is : "+ binaryNum);
		System.out.println("Ocatal ofnum is : "+ octalNum);
		System.out.println("HaxaDecimal of num is : "+ hecNum);
	}
}