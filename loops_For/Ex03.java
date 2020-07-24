//Read an integer (N). This value will be the number of integer values (X) that will be read next.Show how many of these values (X) are within the range [10.20], and how many are outside the range, showing this information as an example (use the word "in" for inside the range, and "out" for outside the range)


package loops_For;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int N, X, in, out;
		
		in = 0;
		out = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert an integer number:");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			X = sc.nextInt();
			
			if (X >= 10 && X <=20) {
				in = in + 1;
			}
			
			else {
				out = out + 1;
			}		
		}
		
		sc.close();
		System.out.println(in + " in");
		System.out.println(out + " out");	
	}
}
