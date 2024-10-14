package test;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class ter {
	public static void verisup(int a) throws supdixexcp{
		if(a < 10) {
			throw new supdixexcp("La saisie est inférieure à 10 !");
		}
	}
			

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int[] N = new int[6];
		for (i = 0; i<N.length;i++) {
		try {
			
			System.out.print("entrer le nombre: ");
			 N[i] = sc.nextInt();
			verisup(N[i]);
			System.out.println("Votre saisie "+i+ "est correcte  :"+N[i]);
			
			
			// TODO: handle exception
			
		} catch (InputMismatchException e) {
			System.out.println("Probleme de saisie");
			sc.nextLine();
			
		} catch(supdixexcp e) {
			System.out.println(e.getMessage());
		}
		}
		
		for (i = 0; i<N.length;i++) {
			System.out.println("le nombre "+i+" est :"+N[i]);
		}
		

	}
	
	public static class supdixexcp extends Exception{
		public supdixexcp(String message) {
			super(message);
		}
	}
	
}
