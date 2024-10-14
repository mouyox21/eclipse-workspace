package ecole;

import java.util.Arrays;
import java.util.Scanner;

public class program {
	public static void tri(etudiant [] l,int b)
	{
		double min;
		int pmin;
		etudiant  tri ;
		for  (int i = 0; i<b;i++)
		{
			min = l[i].moy();
			pmin = i;
			for (int j = 0; j<b-1;j++) {
				if (min > l[j].moy())
		        {
		            min = l[j].moy();
		            pmin = j;

		            tri = l[i];
		            l[i] = l[pmin];
		            l[pmin] = tri;

		        }
				
			}
		}
		
		
	}

	public static void trimat(etudiant [] l,int b)
	{
		double min;
		int pmin;
		etudiant  tri ;
		for  (int i = 0; i<b;i++)
		{
			min = l[i].getMatricule();
			pmin = i;
			for (int j = 0; j<b-1;j++) {
				if (min > l[j].getMatricule())
		        {
		            min = l[j].getMatricule();
		            pmin = j;

		            tri = l[i];
		            l[i] = l[pmin];
		            l[pmin] = tri;

		        }
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Donner le nombre des etudiant : ");
		n = sc.nextInt();
		etudiant[]  N = new etudiant[n];
		 for (int i = 0; i<n;i++) {
			 System.out.println("l'etudiant Numero "+(i+1)+" : ");
			N [i] = new etudiant();
			N[i].setMatricule(i+100); 
		 }
		 System.out.println("-------------------------------------------------------");
		 System.out.println("Prenom\t Nom\t Date de naissance\t Matricule\t\tMoyene\t\t\t Age ");
		 for (int i = 0; i<n;i++) {
			
				N [i].affichage();

			 }
		 
		 tri(N, n);
		 System.out.println("-------------------------------------------------------");
		 System.out.println("\t==> Triage ParMoyen <==");
		 System.out.println("-------------------------------------------------------");
		 System.out.println("Prenom\t Nom\t Date de naissance\t Matricule\t\tMoyene\t\t\t Age ");
		 for (int i = 0; i<n;i++) {
			
				N [i].affichage();

			 }
		 
		trimat(N, n);
		 System.out.println("-------------------------------------------------------");
		 System.out.println("\t==> Triage Par Moyen <==");
		 System.out.println("-------------------------------------------------------");
		 System.out.println("Prenom\t Nom\t Date de naissance\t Matricule\t\tMoyene\t\t\t Age ");
		 for (int i = 0; i<n;i++) {
			
				N [i].affichage();

			 }

	}

}
