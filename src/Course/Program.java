package Course;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char gender = 'M';
		String name = "Rubens C. Jesus";
		int age = 37;
		double balance = 10.35784;
		
		System.out.printf("%.4f%n" ,  balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n" ,  balance);
		System.out.println("-----------------------------");
		System.out.printf("%s é %d year old, gender %c, and got balance= %.2f bitcoins%n", name, age, gender, balance);

				
		sc.close();

	}

}
