package loops_For;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int a = input.nextInt();
			int b = input.nextInt();
			
			
			
			if (b == 0) {
				System.out.println("Split operation is not possible");
			}
			else {
				
				double result = (double) (a/b);
				System.out.println(result);	
			}
		}
		
		input.close();
			
	}
}
