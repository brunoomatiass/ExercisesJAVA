// Challenge: Read an integer, then inform if it's odd or even

package conditionalSentences;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
	
		int n;
		
		System.out.println("Write a number: ");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		sc.close();
		
		if ((n % 2) > 0) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}
}
