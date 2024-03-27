package studio7;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw; 

public class Rectangle {
	
	Scanner in = new Scanner(System.in);
	
	private double length;
	private double width; 
	private double perimeter;
	private double area; 
	private boolean square; 
	
	public Rectangle(double w, double l) {
		length = l;
		width = w;
	}

	public double area() {
		area = length * width; 
		return area; 
	}
	
	public double perimeter() {
		perimeter = (2 * length) + (2 * width);
		return perimeter; 
	}
	
	public boolean square() {
	
		return length == width;
	}
	
	public boolean compare(Rectangle rect) {
	
		return (this.area() == rect.area()); 
	}
	
	public static void main(String[] args) { 		
		
		Rectangle rect1 = new Rectangle(2.0, 2.0);
	
			double area = rect1.area(); 
			double perimeter = rect1.perimeter(); 
			boolean square = rect1.square(); 
		
		Rectangle rect2 = new Rectangle(2.0, 2.0);
	
		System.out.println(rect1.compare(rect2)); 
	
		
	}

		
}
