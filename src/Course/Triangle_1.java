package Course;

import java.util.Locale;
import java.util.Scanner;

public class Triangle_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle x: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double px;
		double py;
		double areax;
		double areay;
		
		px = (xa + xb + xc) / 2;
		areax = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		
		py = (ya + yb + yc) / 2;
		areay = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		System.out.printf("Triangle X area: %.3f%n" , areax);
		
		System.out.printf("Triangle Y area: %.3f%n" , areay);
		
		char larger = (areax > areay? 'X' : 'Y');
		
		System.out.println("Larger area: " + larger);
		
		sc.close();
		
		

	}

}
