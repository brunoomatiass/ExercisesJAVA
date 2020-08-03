//Go to the end of this code to read details about the challenge



package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		double dollarPrice;
		double amount;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertCurrency(dollarPrice, amount));
		
		sc.close();
		
	}

}



/*

CHALLENGE:

Develop a program to read the dollar quotation;

Read the dollar amount to be purchased for in reais;

Inform how many reais the person will pay for the dollars, also considering
that the person will have to pay 6% IOF on the dollar value;

Create a CurrencyConverter class to be responsible for the calculations.

*/
