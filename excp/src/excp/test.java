package excp;

import java.util.InputMismatchException;
import java.util.Scanner;


public class test {
	public static void verisup(int a) throws supdixexcp{
		if(a < 10) {
			throw new supdixexcp("La saisie est inférieure à 10 !");
		}
	}
			

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
		try {
			System.out.print("entrer le nombre: ");
			int entier = sc.nextInt();
			verisup(entier);
			System.out.println("Votre saisie est correcte  :"+entier);
			break;
			// TODO: handle exception
			
		} catch (InputMismatchException e) {
			System.out.println("Probleme de saisie");
			sc.nextLine();
			
		} catch(supdixexcp e) {
			System.out.println(e.getMessage());
		}}while(true);
		
		

	}
	
	public static class supdixexcp extends Exception{
		public supdixexcp(String message) {
			super(message);
		}
	}
	
}
