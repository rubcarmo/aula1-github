package Course;

import java.util.Scanner;

public class ExercLerNumN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many number are you going to check? ");
		int total = sc.nextInt();
		
		int i=1;
		int maior=0;
		int num;
		while (i <= total) {
			System.out.println("Enter N: ");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("Must be positive! Try again");
				num = sc.nextInt();
			} else {
				if(num > maior) {
					maior = num;
				} 

			}
			
			//System.out.println("Value #" + i + "= " + num);
			i++;
		}
		
		System.out.println("Higher: " + maior);
		sc.close();
		
		

	}

}
