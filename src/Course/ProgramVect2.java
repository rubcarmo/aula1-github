package Course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramVect2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product product;
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
			product = new Product();
			sc.nextLine();
			product.Name = sc.nextLine();
			product.Price = sc.nextDouble();
			vect[i] = product; 
		}
		
		double average=0;
		double soma=0;
		
		for(int x=0;x<vect.length; x++) {
			average = ((soma += vect[x].Price) / vect.length);
		}
		
		System.out.printf("AVERAGE PRICE: %.2f%n" , average);

	}

}
