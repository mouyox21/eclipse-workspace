package hola;

import java.util.Scanner;
		
public class methode {
	
	
	
	static void multiplication()

	{
		Scanner sc = new Scanner(System.in);
		int la,lb,ca,cb;
		int i,j,k;
		do 
		{
			
			System.out.println("------------Matrice A-------------");
			System.out.print("-> donner le nombre des ligne : ");
			la = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			ca = sc.nextInt();
			System.out.println("------------Matrice B-------------");
			System.out.print("-> donner le nombre des ligne : ");
			lb = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			cb = sc.nextInt();
			System.out.println("---------------------------------------");
			
		} while (ca != lb);
		int[][] B=new int[lb][cb];
		int[][] A=new int[la][ca];
		int[][] M=new int[la][cb];
		System.out.println("Remplir les matrices");
		System.out.println("------------Matrice A-------------");
		
		for (i=0;i<la;i++) {
			
			for (j=0;j<ca;j++) {
				
				
				System.out.print("A["+i+","+j+"] : ");
				A[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("------------Matrice B-------------");
		for (i=0;i<lb;i++) {
			
			for (j=0;j<cb;j++) {
				
				System.out.print("B["+i+","+j+"] : ");
				B[i][j]=sc.nextInt();
			}
		
		}
		
		for(i = 0; i < la; i++)
		  {
		    for(j = 0; j < cb; j++)
		    {
		      M[i][j]=0;
		      for(k = 0; k < ca; k++)
		      {
		        M[i][j] += A[i][k] * B[k][j];
		      }
		    }
		  }
		System.out.println("-----------------------------------------------------");
		System.out.println("------------Resultat de multiplication :-------------");
		for (i=0;i<la;i++) {
			
			for (j=0;j<cb;j++) {
				System.out.print("\t"+M[i][j]+"\t");
			}
			System.out.println('\n');
		}
		System.out.println("-----------------------------------------------------");
		
	}

	static void addition()
	{
		Scanner sc = new Scanner(System.in);
		int la,lb,ca,cb;
		int i,j;
		do 
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("------------Matrice A-------------");
			System.out.print("-> donner le nombre des ligne : ");
			la = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			ca = sc.nextInt();
			System.out.println("------------Matrice B-------------");
			System.out.print("-> donner le nombre des ligne : ");
			lb = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			cb = sc.nextInt();
			
		} while (la != lb || ca != cb );
		System.out.println("-----------------------------------------------------");
		int[][] B=new int[lb][cb];
		int[][] A=new int[la][ca];
		int[][] M=new int[la][cb];
		System.out.println("Remplir les matrices");
		System.out.println("------------Matrice A-------------");
		
		for (i=0;i<la;i++) {
			
			for (j=0;j<ca;j++) {
				
				
				System.out.print("A[+"+i+","+j+"] : ");
				A[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("------------Matrice B-------------");
		for (i=0;i<lb;i++) {
			
			for (j=0;j<cb;j++) {
				
				System.out.print("B[+"+i+","+j+"] : ");
				B[i][j]=sc.nextInt();
			}
		
		}
		for (i=0;i<la;i++) {
			
			for (j=0;j<cb;j++) {
				
				M[i][j]=A[i][j]+B[i][j];
			}
		
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("------------Resultat d'addition :-------------");
		for (i=0;i<la;i++) {
			
			for (j=0;j<cb;j++) {
				System.out.print("\t"+M[i][j]+"\t");
			}
			System.out.println('\n');
		
		
	}
		System.out.println("-----------------------------------------------------");
	}
	
	static void soustraction()
	{
		Scanner sc = new Scanner(System.in);
		int la,lb,ca,cb;
		int i,j;
		System.out.println("-----------------------------------------------------");
		do 
		{
			
			System.out.println("------------Matrice A-------------");
			System.out.print("-> donner le nombre des ligne : ");
			la = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			ca = sc.nextInt();
			System.out.println("---------------------------------------");
			System.out.println("------------Matrice B-------------");
			System.out.print("-> donner le nombre des ligne : ");
			lb = sc.nextInt();
			System.out.print("-> donner le nombre des colonnes : ");
			cb = sc.nextInt();
			System.out.println("---------------------------------------");
			
		} while (la != lb || ca != cb );
		
		int[][] B=new int[lb][cb];
		int[][] A=new int[la][ca];
		int[][] M=new int[la][cb];
		System.out.println("-----------------------------------------------------");
		System.out.println("Remplir les matrices");
		System.out.println("------------Matrice A-------------");
		
		for (i=0;i<la;i++) {
			
			for (j=0;j<ca;j++) {
				
				
				System.out.print("A[+"+i+","+j+"] : ");
				A[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("------------Matrice B-------------");
		for (i=0;i<lb;i++) {
			
			for (j=0;j<cb;j++) {
				
				System.out.print("B[+"+i+","+j+"] : ");
				B[i][j]=sc.nextInt();
			}
		
		}
		for (i=0;i<la;i++) {
			
			for (j=0;j<cb;j++) {
				
				M[i][j]=A[i][j]-B[i][j];
			}
		
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("------------Resultat de soustraction :-------------");
		for (i=0;i<la;i++) {
			
			for (j=0;j<cb;j++) {
				System.out.print("\t"+M[i][j]+"\t");
			}
			System.out.println('\n');
		
		
	}
		System.out.println("-----------------------------------------------------");
	}
	
	static void transpose()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,la,ca;
		System.out.println("-----------------------------------------------------");
		System.out.println("------------Matrice A-------------");
		System.out.print("-> donner le nombre des ligne : ");
		la = sc.nextInt();
		System.out.print("-> donner le nombre des colonnes : ");
		ca = sc.nextInt();
		System.out.println("---------------------------------------");
		int[][] A=new int[la][ca];
		System.out.println("Remplir la matrice");
		System.out.println("------------Matrice A-------------");
		for (i=0;i<la;i++) {
			
			for (j=0;j<ca;j++) {
				
				System.out.print("T[+"+i+","+j+"]");
				A[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("\t le tableau transposée:");
		for (j=0;j<ca;j++) {
			
			for (i=0;i<la;i++) {
				System.out.print("\t"+A[i][j]+"\t");
			}
			System.out.println('\n');
			}
		System.out.println("-----------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		 
		do 
		{
			System.out.println("\t--------------CALCUL DES MATRICES------------+");

			System.out.println("\t| 1 -> L’ Addition de deux matrices          |");
			System.out.println("\t| 2 -> La Soustraction de deux matrices      |");
			System.out.println("\t| 3 -> La Multiplication de deux matrices    |");
			System.out.println("\t| 4 -> La Transposée de  matrice             |");
			System.out.println("\t| 5 -> Quitter                               |");
			System.out.println("\t---------------------------------------------+");
			System.out.print("\tchoisir le calcul ==>  ");
			ch = sc.nextInt();
			
			switch (ch)
			{
			case 1:
				addition();
				break;
			
			case 2:
				soustraction();
				break;
				
			case 3:
				multiplication();
				break;
			case 4 :
				
				transpose();
				
				break;
			case 5 :
				System.out.println(" \t Au Revoir (◠⁠‿⁠・⁠)");
				break;
				
			}
		}while (!(ch == 5));
	     	
		

}
}
