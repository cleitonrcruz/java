package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("Informe a quantidade de minutos: ");

		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double valorConta = 50.00;

		if (minutos > 100) {
			valorConta += ((minutos - 100) * 2);
		}

		System.out.printf("Valor a pagar: R$ %.2f%n", valorConta);

		sc.close();
	}

}
