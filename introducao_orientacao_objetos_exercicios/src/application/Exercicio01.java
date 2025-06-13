package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AreaRetangulo;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AreaRetangulo area = new AreaRetangulo();
		
		System.out.println("Enter rectangle width and heidht: ");
		area.width = sc.nextDouble();
		area.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", area.areaRetangulo());
		System.out.printf("PERIMETER = %.2f %n", area.perimetroRetangulo());
		System.out.printf("DIAGONAL = %.2f", area.diagonalRetangulo());
		sc.close();

	}

}
