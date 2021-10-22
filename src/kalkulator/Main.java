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
			
			if(s.equals("")) {
				continue; 
			}
			
			String[] pars = s.split(" "); 
			
			if(pars.length != 3){
				continue; 
			}
			
		}while(!s.equals("kraj"));
	}

}
