package loops_While;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int tipo = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabela de combustíveis:");
		System.out.println("1.Alcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.SAIR");
		System.out.println();
		
		while (tipo != 4) {
			
			if(tipo == 1) {
				alcool = alcool + 1;}
			else if (tipo ==  2) {
				gasolina = gasolina + 1;}
			else {
				diesel = diesel + 1;}
			
			System.out.println("qual o combustível do próximo cliente?");
			tipo = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + alcool);
		
		sc.close();
	}

}
