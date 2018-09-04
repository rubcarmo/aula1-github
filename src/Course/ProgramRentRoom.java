package Course;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramRentRoom {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("How many rooms will be rented: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[n];
		Rent rent = null;
		
		for(int i=0; i<vect.length;i++) {
			rent = new Rent();
			//sc.nextLine();
			
			//System.out.print("Rent #" + i + ": ");
			//rent.id = sc.nextInt();

			System.out.print("Name: ");
			rent.name = sc.nextLine();
			
			sc.nextLine();
			
			System.out.print("Email: ");
			rent.email = sc.nextLine();
			
			
			System.out.println("Room: ");
			rent.room = sc.nextInt();
			
			vect[i] = rent;
			
		}
		
		System.out.println("Busy rooms: ");
		
		for(int x=0; x<vect.length; x++) {
			if(vect[x] != null) {
				System.out.println(vect[x]);
			}
		}
		
		sc.close();


	}

}
