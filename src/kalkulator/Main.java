package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner; //prethodno iportujemo taj paket da bi mogli koristiti tu vrstu promenljive 
		scanner = new Scanner(System.in);
		
		//scanner.nextLine(); //vraca povratnu vrednost 
		
		String s = scanner.nextLine(); 
		System.out.println(s);
		
		do {
			//kod koji se izvrsava 
			s = scanner.nextLine(); 
		}while(!s.equals("kraj"));
	}

}
