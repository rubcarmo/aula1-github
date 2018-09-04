package Course;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean c1 = 2 > 3 || 4 != 5;
		boolean c2 = !(2 > 3) && 4 != 5;
		boolean c3 = 10 < 5;
		
		boolean c4 = c1 || c2 && c3;
		
		System.out.println("C1: " + c1);
		System.out.println("C2: " + c2);
		System.out.println("C4: " + c4);
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String a , b , c;
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		System.out.println(entrada + " " + a + " " + b + " " + c);
		
		sc.close();

	}

}
