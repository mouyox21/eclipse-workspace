package hola;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int la,lb,ca,cb;
		int lc,ls,lm,cc,cs,cm,ch;
		
				
		do 
		{
			
			System.out.println("---------------------------------------");
			System.out.println("1 -> L’addition de deux matrices");
			System.out.println("2 -> La soustraction de deux matrices");
			System.out.println("3 -> La multiplication de deux matrices");
			System.out.println("---------------------------------------");
			System.out.println("choisir le calcul :");
			ch = sc.nextInt();

		} while (ch >3 || ch <0);
		
		
		

	}

}
