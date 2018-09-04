package Course;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Employee emploee = new Employee();
		
		System.out.println("Name: ");
		emploee.Name = sc.nextLine();

		System.out.println("Salario bruto: ");
		emploee.Salario = sc.nextDouble();
		
		System.out.println("Tax: ");
		emploee.Tax = sc.nextDouble();
		
		System.out.println(emploee);


	}

}
