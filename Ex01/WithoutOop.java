/*
Solving a problem whithout using Oop. 
Go to the end of the code to see details about the problem.
*/  



package Ex01;

import java.util.Locale;
import java.util.Scanner;

public class WithoutOop {

	public static void main(String[] args) {
		
		double xa, xb, xc, xArea, ya, yb, yc, yArea, px, py;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle x: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		px = (xa + xb + xc)/2;
		xArea =  Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
		
		System.out.println("Enter the measures of triangle y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		py = (ya + yb + yc)/2;
		yArea =  Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));
		
		System.out.printf("Triangle X area: %.4f%n", xArea);
		System.out.printf("Triangle Y area: %.4f%n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Larger area: x");
		}
		
		else {
			System.out.println("Larger area: y");
		}
		
		sc.close();
	}

}






/*
 
 
Challenge: 
 
Read the measurements of the sides of two triangles X and Y (suppose measurements
valid).
 
Then, show the value of the areas of the two triangles and tell which of the
two triangles has the largest area.

The formula for calculating the area of a triangle from the measurements of its sides a,
b and c is the following (Heron's formula): 

p = (a + b + c)/2

area = p( p - a)( p - b)( p - c) 2
  


Example:

Enter the measures of triangle X:
3.00
4.00
5.00
Enter the measures of triangle Y:
7.50
4.50
4.02
Triangle X area: 6.0000
Triangle Y area: 7.5638
Larger area: Y 
 */
