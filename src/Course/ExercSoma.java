package Course;

import java.util.Scanner;

public class ExercSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integer namber are you going to enter? ");
		int num = sc.nextInt();
		
		int soma=0;
		
		for(int i=1; i<=num; i++ ) {
			System.out.println("Digite o " + i + "º number: ");
			soma += sc.nextInt();
		}
		System.out.println("soma= " + soma);
		
		sc.close();

	}

}
