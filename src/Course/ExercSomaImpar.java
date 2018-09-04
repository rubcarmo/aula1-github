package Course;

import java.util.Scanner;

public class ExercSomaImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int n1 = sc.nextInt();

		System.out.println("Digite outro numero inteiro: ");
		int n2 = sc.nextInt();
		
		int menor = n1, maior = n2 ;
	
		/*if(n1 > n2) {
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		*/
		
		if (n2 < n1) {
			menor = n2;
			maior = n1;
		}
		int soma=0;
		for(int i= menor; i<=maior; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
	
		}
		System.out.println("Soma dos numeros impares: " + soma);
				
		sc.close();
		


	}

}
