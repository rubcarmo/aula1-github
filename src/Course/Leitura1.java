package Course;

import java.util.*;

public class Leitura1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		
		String[] vect = sc.nextLine().split(" ");
		
		
		
		System.out.println("Valor lido console: " + a + "\n" + b + "\n" + c + "\n" + d);
		
		for(int i=0; i < vect.length; i++) {
			System.out.println(vect[i] + " ");
		}

	}

}
