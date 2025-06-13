package entities;

public class CurrencyConverter {

	public static final double IOF = 6;
	
	public static double convert(double dolarPrice, double dolarAmount) {
		
		return (dolarAmount * dolarPrice) + (dolarAmount * dolarPrice * (IOF / 100));
		
	}
	
}
