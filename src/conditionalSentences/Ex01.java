//Challenge: Read a number, then inform if this number is positive or negative.


package conditionalSentences;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input a number: ");
		n = input.nextInt();
		input.close();
		
		if (n >= 0) {
			System.out.println("This number is positive");
		} else {
			System.out.println("This number is negative");
		}
		
		
	}

}
