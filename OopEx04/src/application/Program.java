/*
CHALLENGE

develop a program to read the width and height values
of a rectangle. Then, show on the screen the value of
its area, perimeter and diagonal. Use a class to set 
attributes and methods to the rectangle.
*/


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.toString());
		
		
		sc.close();
	}

}
