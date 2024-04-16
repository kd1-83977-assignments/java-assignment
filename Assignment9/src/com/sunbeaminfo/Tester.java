package com.sunbeaminfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<LibraryBooks> lb= new HashSet<>();
		
		class AuthorComparator implements Comparator<LibraryBooks>{

			@Override
			public int compare(LibraryBooks o1, LibraryBooks o2) {
				int element=o1.authorName.compareTo(o2.authorName);
				return element;
			}
			
		}
		
		class CategoryComparator implements Comparator<LibraryBooks>{

			@Override
			public int compare(LibraryBooks o1, LibraryBooks o2) {
				int element=o1.cat.compareTo(o2.cat);
				return element;
			}
			
		}
		
		
		int choice;
		do {
			System.out.println("0. to Exit");
			System.out.println("1. to Add Accept books ");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the books as per category and display it");
			System.out.println("4. Sort the book details as per author and display it");
			System.out.println("5. Find book by id");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("thank youuu");
				
				break;
			case 1:
				LibraryBooks l1 = new LibraryBooks();
				l1.accept(sc);
				
				lb.add(l1);
				
				break;
			case 2:
				for(LibraryBooks b: lb) {
					System.out.println(b);
				}
				
				
				break;
			case 3:
			ArrayList<LibraryBooks> a1 = new ArrayList<>(lb);
			Comparator<LibraryBooks> clb= new CategoryComparator();
			Collections.sort(a1,clb);
				
				for(LibraryBooks b: a1) {
					System.out.println(b);
				}
				
				break;
			case 4:
				ArrayList<LibraryBooks> a = new ArrayList<>(lb);
				Comparator<LibraryBooks> rlb= new AuthorComparator();

				Collections.sort(a, rlb);
				for(LibraryBooks bb: a) {
					System.out.println(bb);
				}
							
				break;
			case 5:
				
				System.out.println("Enter Specific author name");
                String authorName = sc.next();
                for (LibraryBooks book : lb) {
                    if (book.getAuthorName().equals(authorName)) {
                        System.out.println(book);
                        break;
                    }
                }
				break;
				

			default:
				break;
			}
				
		}while(choice !=0);
			
	}

}
