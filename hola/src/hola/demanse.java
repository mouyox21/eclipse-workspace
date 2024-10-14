package hola;

import java.util.Scanner;

public class demanse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch,la,lb,ca,cb;
		int i,j,k;
		do 
		{
			System.out.println("--------------CALCUL DES MATRICES------------+");

			System.out.println("| 1 -> L’ Addition de deux matrices          |");
			System.out.println("| 2 -> La Soustraction de deux matrices      |");
			System.out.println("| 3 -> La Multiplication de deux matrices    |");
			System.out.println("| 4 -> La Transposée de  matrice             |");
			System.out.println("---------------------------------------------+");
			System.out.println("choisir le calcul :");
			ch = sc.nextInt();

		} while (ch >4 || ch <=0);

		if	(ch == 3)
		{
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
				
			} while (ca != lb);
			
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
			System.out.println("-----------------------------");
			System.out.println("------------Resultat de multiplication :-------------");
			for (i=0;i<la;i++) {
				
				for (j=0;j<cb;j++) {
					System.out.print(M[i][j]+" ");
				}
				System.out.println('\n');
			}
			
			
			

	}
		else if	(ch == 1)
		{
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
			System.out.println("------------Resultat d'addition :-------------");
			for (i=0;i<la;i++) {
				
				for (j=0;j<cb;j++) {
					System.out.print(M[i][j]+" ");
				}
				System.out.println('\n');
			
			
		}
	}
		else if	(ch == 2)
		{
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
			System.out.println("------------Resultat de soustraction :-------------");
			for (i=0;i<la;i++) {
				
				for (j=0;j<cb;j++) {
					System.out.print(M[i][j]+" ");
				}
				System.out.println('\n');
			
			
		}
	}
		else if (ch == 4)
		{
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
			System.out.println("le tableau transposée:");
			for (j=0;j<ca;j++) {
				
				for (i=0;i<la;i++) {
					System.out.print(A[i][j]+" ");
				}
				System.out.println('\n');
				}
			
		}

	}
	}
