
//Write a program that repeats reading a password until it is valid. For each wrong, write the message "Invalid Password". When the password is entered correctly, show "Access Allowed", and the algorithm is closed. Consider that the correct password is "2002".



package loops_While;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int pass, input;
		pass = 2002;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the password: ");
		input = sc.nextInt();
			
		while (input != pass) {
			System.out.println("Wrong password.");
			input = sc.nextInt();}
		
		System.out.println("Access Allowed");
		sc.close();}}
		