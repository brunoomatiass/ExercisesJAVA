//Read an integer value (n), which represents the number of test cases that follow. Each test case consists of 3 real values, each with one decimal place. Display the weighted average for each of these sets of 3 values, with the first value having weight 2, the second value having weight 3 and the third value having weight 5.



package loops_For;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double result = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", result);
		}
		
		sc.close();
	}
}