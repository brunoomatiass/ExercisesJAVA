package entities;

public class CurrencyConverter {

	 
	public static double IOF = 0.06;
	
	public static double convertCurrency(double dollarPrice, double amount) {
		return dollarPrice * amount * (1.0 + IOF);
	}
}
