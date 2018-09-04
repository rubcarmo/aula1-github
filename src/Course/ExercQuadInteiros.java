package Course;

import java.util.Scanner;

public class ExercQuadInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer value: ");
		int valor = sc.nextInt();
		
		while (valor != 0) {
		
			int quadrado = valor * valor;
			System.out.println(quadrado);
			
			System.out.println("Enter a integer value: ");
			valor = sc.nextInt();
		}
		
		System.out.println("Zero is not allowed");

	}

}
