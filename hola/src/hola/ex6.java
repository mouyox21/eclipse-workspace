package hola;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,c;
		
		System.out.print("donner le nombre des ligne :");
		l = sc.nextInt();
		
		int[][] B=new int[3][3];
		int[][] A=new int[3][3];
		int[][] C=new int[3][3];
		int[][] S=new int[3][3];
		int[][] M=new int[3][3];
		int i,j,k;
		
		
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				
				System.out.print("A[+"+i+","+j+"] : ");
				A[i][j]=sc.nextInt();
			}
		
		}
		
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				
				System.out.print("B[+"+i+","+j+"] : ");
				B[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("Matrice A :");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println('\n');
		}
		System.out.println("Matrice B :");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println('\n');
		}
		
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				
				C[i][j]=A[i][j]+B[i][j];
			}
		
		}
		
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				
				S[i][j]=A[i][j]-B[i][j];
			}
		
		}
		
		for(i = 0; i < 3; i++)
		  {
		    for(j = 0; j < 3; j++)
		    {
		      M[i][j]=0;
		      for(k = 0; k < 3; k++)
		      {
		        M[i][j] += A[i][k] * B[k][j];
		      }
		    }
		  }
		
		
		System.out.println("Addition:");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println('\n');
		}
		
		System.out.println("soustraction:");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(S[i][j]+" ");
			}
			System.out.println('\n');
		}
		System.out.println("multiplication:");
		for (i=0;i<3;i++) {
			
			for (j=0;j<3;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println('\n');
		}
		

	}

}
