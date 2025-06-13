package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dolQtd = sc.nextDouble();
		double result = CurrencyConverter.convert(dolPrice, dolQtd);
		
		System.out.printf("Amount to be paid in reais = %.2f %n", result);
		
		sc.close();

	}

}
