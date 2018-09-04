package Course;

import java.util.Scanner;

public class Leitura2 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		int num = sc.nextInt();
		
		sc.nextLine();
		String nome = sc.nextLine();

		char gender = sc.next().charAt(0);
		
		sc.nextLine();
		
		String codigo = sc.nextLine();
		char x = codigo.charAt(0);
		int y = Integer.parseInt(codigo.substring(1));
		
		//sc.nextLine();
		double num2 = sc.nextDouble();
		
		System.out.println("num: " + num);
		System.out.println("nome: " + nome);
		System.out.println("caracter: " + gender);
		System.out.println("codigo: " + x + y);
		System.out.println("double: " + num2);
		

	}

}
