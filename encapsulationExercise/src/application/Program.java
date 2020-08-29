package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y / n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account (accountNumber, accountHolder, initialDeposit);
		}
		
		else {
			account = new Account(accountNumber,accountHolder);
			
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		sc.close();

	}

}
