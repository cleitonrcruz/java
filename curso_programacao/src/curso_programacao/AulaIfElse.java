package curso_programacao;

import java.util.Scanner;

public class AulaIfElse {

	public static void main(String[] args) {
		
		System.out.print("Digite o número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("É ímpar.");
		}
		
		sc.close();
		
	}

}
