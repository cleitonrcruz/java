package curso_programacao;

import java.util.Scanner;

public class WhileTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.printf("Soma: %d", soma);

		sc.close();

	}

}
