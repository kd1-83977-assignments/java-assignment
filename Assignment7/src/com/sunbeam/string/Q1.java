package com.sunbeam.string;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s= sc.next();
		
		StringBuilder s2 = new StringBuilder();
		
		int lenStr=s.length();
		for(int i =lenStr-1;i>=0;--i) {
			s2.append(s.charAt(i));
		}
		
		String s3 = new String(s2);
		
		System.out.println(s3);
		
		
	}

}
