package Course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVect1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double average=0;
		double soma=0;
		
		for(int x=0;x<vect.length; x++) {
			average = ((soma += vect[x]) / vect.length);
		}
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n" , average);
		
		

	}

}
