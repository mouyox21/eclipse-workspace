package hola;

import java.util.Scanner;

public class tableau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T[]=new int[5];
		int i;
		int min,max;
		int p,n,z;
		
			p=0;
			n=0;
			z=0;
		
		for (i=0;i<5;i++) {
			System.out.print("T[+"+i+"]");
			T[i]=sc.nextInt();
			if (0>T[i]) 
			{
				n=n+1;
			}
			else if (0<T[i])
			{
				p=p+1;;
			}
			else {
				z=z+1;
				}
					
		}
		
		System.out.print("le tableau saisi:");
		for (i=0;i<5;i++) {
			System.out.print(T[i]+" ");
		}
		
		System.out.print("le tableau saisi:");
		for (i=4;i<0;i--) {
			System.out.print(T[i]+" ");
		}
		
		for (i=0;i<5;i++) {
			System.out.print(T[i]+" ");
		}
		min=T[0];
		max=T[0];
		
		for (i=1;i<5;i++) {
			if (min>T[i]) 
			{
				min=T[i];
			}
	if (max<T[i])
			{
				max=T[i];
			}
		}
		System.out.println("min est : " +min);
		System.out.println("max est : " +max);
		System.out.println("le nombre de zéro est : " +z);
		System.out.println("le nombre d’éléments négatifs est : " +z);
		System.out.println("le nombre d’éléments positif est : " +p);
	}

}
