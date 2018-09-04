package Course;

import java.util.Scanner;

public class ExercRaizQuad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a namber: ");
		int num = sc.nextInt();
		
		
		while (num >=0) {
			double raiz = Math.sqrt(num);
			System.out.printf("%.3f%n", raiz);
			
			System.out.println("\nEnter another namber: ");
			num = sc.nextInt();
		}
		
		System.out.println("Negative namber");
		
		sc.close();
		

	}

}
