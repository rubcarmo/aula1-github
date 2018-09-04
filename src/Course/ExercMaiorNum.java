package Course;

import java.util.Scanner;

public class ExercMaiorNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 num inteiros na mesma linha:");
		
		String[] numeros = sc.nextLine().split(" ");
		int a = Integer.parseInt(numeros[0]);
		int b = Integer.parseInt(numeros[1]);
		int c = Integer.parseInt(numeros[2]);
		
		int maior = max(a,b,c);
		showResult(maior);
		
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		int maior=0;
		
		if(a > b && a > c) {
			maior=a;
		} else if (b > c) {
			maior=b;
		} else {
			maior=c;
		}
		return maior;
		
	}
	
	public static void showResult(int maior) {
		System.out.println("Higher: " + maior);
	}

}
