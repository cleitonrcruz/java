package application;

import java.util.Locale;
import java.util.Scanner;
import entities.SalarioFuncionario;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SalarioFuncionario salario = new SalarioFuncionario();
		
		System.out.print("Name: ");
		salario.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println("");
		System.out.printf("Employee: %s, $ %.2f", salario.name, salario.netSalary());
		System.out.println("");
		
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		double increaseSalary = sc.nextDouble();
		salario.increaseSalary(increaseSalary);
		
		System.out.println("");
		System.out.println("Updated data: " + salario);
		
		sc.close();

	}

}
