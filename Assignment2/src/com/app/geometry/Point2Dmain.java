package com.app.geometry;

public class Point2Dmain {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.accept();
		
		Point2D p2 = new Point2D();
		p2.accept();
		
		//p1.isEqual(p1, p2);
		if(p1.isEqual(p1, p2))
		{
			System.out.println("Points are equal");
		}else {
			System.out.println("Points are not equal");
		}
		
		p1.calculateDistance(p1, p2);
		
		

	}

}
