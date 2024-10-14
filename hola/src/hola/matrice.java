package hola;

import java.util.Scanner;

public class matrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] T=new int[3][3];
		int i,j;
		
		
		
		for (i=0;i<3;i++) {
		
			for (j=0;j<3;j++) {
				
				System.out.print("T[+"+i+","+j+"]");
				T[i][j]=sc.nextInt();
			}
		
		}
		
		System.out.println("le tableau saisi:");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(T[i][j]+" ");
			}
			System.out.println('\n');
		}
			
		
			System.out.println("le tableau transposée:");
		for (j=0;j<3;j++) {
			
			for (i=0;i<3;i++) {
				System.out.print(T[i][j]+" ");
			}
			System.out.println('\n');
			}

		}
		


	}



