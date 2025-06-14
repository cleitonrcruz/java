package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ExercicioList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		int id;
		String name;
		double salary;
		double percentage;

		
		System.out.print("How many employees will be registered? ");
		int numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println();
			System.out.printf("Emplyoee #%d:%n", i);

			System.out.print("Id: ");
			id = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Name: ");
			name = scan.nextLine();
			
			System.out.print("Salary: ");
			salary = scan.nextDouble();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idBusca = scan.nextInt();
		
		Employee result = list.stream()
			    .filter(emp -> emp.getId() == idBusca)
			    .findFirst()
			    .orElse(null);
		
		if (result != null) {
			System.out.print("Enter the percentage: ");
			percentage = scan.nextDouble();
			
			result.increaseSalary(percentage);
			
		} else {
			System.out.println("This id does not exist!");
		}
		
		scan.close();
		
		System.out.println("\nList of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

	}

}
