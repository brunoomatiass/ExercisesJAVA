// go to the end of the code to see details about the challenge


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product01 = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product01.name = sc.nextLine();
		System.out.print("Price: ");
		product01.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product01.quantity = sc.nextInt();
		
		System.out.println("product data: " + product01);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product01.addProducts(quantity);
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product01.removeProducts(quantity);
		
		System.out.println("Updated product: " + product01);
		
		sc.close();
	}

}






/*

CHALLENGE	

Develop a program to read the data of a product in stock (name, price and
quantity in stock). Then:

• Show product data (name, price, quantity in stock, total value in
stock)

• Make a stock entry and show the product data again

• Make a check in the stock and show the product data again

To solve this problem, you must create a class.



Example


Enter product data:
Name: TV
Price: 900.00
Quantity in stock: 10
Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
Enter the number of products to be added in stock: 5
Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
Enter the number of products to be removed from stock: 3
Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00

*/
