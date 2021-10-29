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
				if(s.equals("Kraj")) {
					continue; 
				}
				System.out.println("Pogresan format naredbe!");
				continue; 
			}
			int x = Integer.parseInt(pars[0]);	 // prima string kao parametar i prebacuje u int (kao atoi)
			int y = Integer.parseInt(pars[2]);
			if(pars[1].equals("+")) {
				addition(x,y);
			}
			
		}while(!s.equals("kraj"));
	}
	public static void addition(int x, int y) {
		System.out.println(x+y); 
	}
}
