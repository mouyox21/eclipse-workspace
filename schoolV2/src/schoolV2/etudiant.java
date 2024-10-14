package schoolV2;

import java.util.Scanner;

import ecole.etudiant;


public class etudiant {
	Scanner sc = new Scanner(System.in);
	private String Prenom,nom;
	private double [] note = new double [6];
	private int matricule;
	
	etudiant(){
		 System.out.print("donner le prenom d'etudiant : ");
		 Prenom = sc.nextLine();
		 
		 System.out.print("donner le nom d'etudiant : ");
		 nom = sc.nextLine();
		 
		 
		 for (int i = 0; i<6;i++) {
			 do {
				 System.out.print("donner la note Numero "+(i+1)+" : ");
				 note[i]= sc.nextDouble();
			} while (note[i]>20 || note[i]<0);
		}
		 
		
		 
	 }
	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double[] getNote() {
		return note;
	}

	public void setNote(double[] note) {
		this.note = note;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	etudiant[]  N ;
	
	public void rmplissage(int a) {
		for (int i = 0; i<a;i++) {
			 System.out.println("l'etudiant Numero "+(i+1)+" : ");
			N [i] = new etudiant();
			N[i].setMatricule(i+100); 
		 }
		
	}
	public double moy()
	{
		double moyene = 0;
		 for (int i = 0; i<6;i++) {
			 moyene = moyene + note[i];
		}
		return moyene/6;
	}
		
	
	
	public void affichage(int Z) {
		 System.out.println("Prenom\t Nom\t Matricule\t Moyene ");
		 for (int i = 0; i<Z;i++) {
			
			 System.out.println(N[i].getPrenom()+"\t "+N[i].getNom()+"\t "+N[i].getMatricule()+"\t\t"+moy());
				
			 }
		

		 
		 
		// System.out.println("donner le nom d'etudiant : "+nom);
		 
		// System.out.println("donner le matricule d'etudiant : "+matricule);
		 
		 
		 
//		 for (int i = 0; i<6;i++) {
//			 System.out.print("donner la note Numero"+(i+1)+": " +note [i]+"\n");
		
//		}
//		 System.out.println("le moyen est : "+moy());
		 
		
	}
	}
