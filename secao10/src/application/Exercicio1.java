package application;

import java.util.Locale;
import java.util.Scanner;
import entities.NumerosNegativos;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas posições deve ter? ");
		int n = sc.nextInt();
		int numero = 0;
		
		while(n <= 0 || n > 10) {
			if (n >= 10) {
				System.out.print("O número deve ser menor que 10, digite novamente: ");
			} else {
				System.out.print("O número deve ser positivo e maior que zero, digite novamente: ");
			} 
			
			n = sc.nextInt();
		}
		
		NumerosNegativos[] vect = new NumerosNegativos[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			vect[i] = new NumerosNegativos(numero);
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		sc.close();

	}

}
