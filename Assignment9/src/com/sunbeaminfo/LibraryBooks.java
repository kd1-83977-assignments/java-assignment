package com.sunbeaminfo;

import java.util.Scanner;

enum Category{
	Historical,
	Story,
	Study
}

public class LibraryBooks {
	String isbn;
	private double price;
	Category cat;
	String authorName;
	private int quantity;
	
	public LibraryBooks() {
		// TODO Auto-generated constructor stub
	}

	public LibraryBooks(String isbn, double price, Category cat, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.cat = cat;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void accept(Scanner sc) {
		System.out.println("enter book details");
		sc.nextLine();
		isbn=sc.nextLine();
		
		System.out.println("enter Price");
		price=sc.nextDouble();
		System.out.println("Enter book Category Study,\n"+ "	Story,\n"+ "	Historical");
		String choice1;
		choice1=sc.next();
		cat=Category.valueOf(choice1);
		System.out.println("Enter Author Name");
		authorName=sc.next();
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
		
	}
	
	@Override
	public String toString() {
		return "LibraryBooks [isbn=" + isbn + ", price=" + price + ", cat=" + cat + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
