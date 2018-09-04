package Course;

import java.util.Locale;
import java.util.Scanner;

public class Triangle_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle tx = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		tx.a = sc.nextDouble();
		tx.b = sc.nextDouble();
		tx.c = sc.nextDouble();
		
		Triangle ty = new Triangle();
		
		System.out.println("Enter the measures of triangle y: ");
		ty.a = sc.nextDouble();
		ty.b = sc.nextDouble();
		ty.c = sc.nextDouble();
		
		
		System.out.printf("Triangle X area: %.3f%n" , tx.area());
		
		System.out.printf("Triangle Y area: %.3f%n" , ty.area());
		
		char larger = (tx.area() > ty.area()? 'X' : 'Y');
		
		System.out.println("Larger area: " + larger);
		
		sc.close();
		
		

	}

}