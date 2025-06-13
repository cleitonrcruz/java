package curso_programacao;

import java.util.Scanner;

public class ForTeste {

	public static void main(String[] args) {

		System.out.print("Quantos números deseja somar? ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.printf("A soma dos %d números é: %d", n, soma);
		
		sc.close();

	}

}
