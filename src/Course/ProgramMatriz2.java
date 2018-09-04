package Course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		//Populando a matriz
		for(int i=0;i<mat.length;i++) {
			for(int x=0;x<mat[i].length; x++) {
				mat[i][x]= sc.nextInt();
			}
		}
		
		// Impressão de toda a matriz
		/*for(int i=0;i<mat.length;i++) {
			for(int x=0;x<mat[i].length; x++) {
				System.out.print(mat[i][x] + " ");
			}
			System.out.println("\n");
		}*/
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();


	}

}
