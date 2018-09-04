package Course;

import java.util.Locale;
import java.util.Scanner;

public class Leitura3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
				
		System.out.println("How many bedrooms are there in your house :");
		int bedrooms = sc.nextInt();
		
		System.out.println("Enter the product price:");
		double pprice = sc.nextDouble();
		
		System.out.println("Ente your last name, age and height (same line):");
		sc.nextLine();
		
		String[] x = sc.nextLine().split(" ");
		String lastname = x[0];
		int age = Integer.parseInt(x[1]);
		double height = Double.parseDouble(x[2]);
		
		// Saidas
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(pprice);
		System.out.println(lastname);
		System.out.println(age);
		System.out.println(height);
		
		
		

	}

}
