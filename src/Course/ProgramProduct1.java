package Course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.Name = sc.nextLine();
		
		System.out.println("Price: ");
		product.Price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.Quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println("Enter the number of products to be added in stock");
		int addstock = sc.nextInt();
		
		product.AddProducts(addstock);
		
		System.out.println(product);

		System.out.println("Enter the number of products to be removed in stock");
		int removestock = sc.nextInt();

		product.RemoveProducts(removestock);
		
		System.out.println(product);
		
		
		sc.close();
		

	}

}
