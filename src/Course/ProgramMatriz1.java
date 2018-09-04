package Course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int x=0;x<n; x++) {
				mat[i][x]= sc.nextInt();
			}
		}
		
		/* Impressão de toda a matriz
		for(int i=0;i<n;i++) {
			for(int x=0;x<n; x++) {
				System.out.print(mat[i][x] + " ");
			}
			System.out.println("\n");
		}
		*/
		
		// Impressão Main diagonal
		System.out.println("Main diagonal:");
		
		for(int i=0;i<mat.length;i++) {
			System.out.println(mat[i][i] + " ");
		}

		// Impressão negative number
				
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);


		sc.close();

	}

}
