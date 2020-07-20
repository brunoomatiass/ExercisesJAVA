//Write a program to read the coordinates (X, Y) of an undetermined number of points in the Cartesian system. For each point write, the quadrant to which it belongs. The algorithm will be terminated when least one of two coordinates is NULL (writing STOP).


package loops_While;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int x, y;
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		
		while (x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("first quadrant");}
			
			else if (x < 0 && y > 0) {
				System.out.println("second quadrant");}
			
			else if (x < 0 && y < 0) {
				System.out.println("third quadrant");}
			
			else {
				System.out.println("fourth quadrant");}
			
			x = input.nextInt();
			y = input.nextInt();	
		}
		
		input.close();
		System.out.println("STOP");

	}

}
