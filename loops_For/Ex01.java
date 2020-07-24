package loops_For;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < entrada; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();
	}

}
