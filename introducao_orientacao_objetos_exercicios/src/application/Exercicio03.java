package application;

import java.util.Locale;
import java.util.Scanner;
import entities.NotaAluno;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		NotaAluno nota = new NotaAluno();
		
		System.out.print("Enter the student's name: ");
		nota.name = sc.nextLine();
		
		for (int i = 1; i <= 3; i++) {
			System.out.printf("Enter the grade %d: ", i);
			double notaAluno = sc.nextDouble();
			nota.grade += notaAluno;
		}
		
		System.out.println(" ");
		System.out.print(nota);
		
		sc.close();

	}

}
