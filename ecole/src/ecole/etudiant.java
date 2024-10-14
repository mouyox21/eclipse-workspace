package ecole;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Scanner;

public class etudiant {
	Scanner sc = new Scanner(System.in);
	private String Prenom,nom;
	private int matricule;
		
	
	private double [] note = new double [6];

	private Date ab ;
	

	
	etudiant(String pre,String no)
	{
		 for (int i = 0; i<6;i++) {
			 do {
				 System.out.print("donner la note Numero "+(i+1)+" : ");
				 note[i]= sc.nextDouble();
			} while (note[i]>20 || note[i]<0);
		}
	}
	 etudiant(){
		 System.out.print("donner le prenom d'etudiant : ");
		 Prenom = sc.nextLine();
		 
		 System.out.print("donner le nom d'etudiant : ");
		 nom = sc.nextLine();
		 ab = new Date();
		 
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
	public Date getAb() {
		return ab;
	}
	public void setAb(Date ab) {
		this.ab = ab;
	}

	public double moy()
	{
		double moyene = 0;
		 for (int i = 0; i<6;i++) {
			 moyene = moyene + note[i];
		}
		return moyene/6;
	}

	public int age() 
	{
		LocalDate Today = LocalDate.now();

		return Math.abs(Period.between(Today, ab.getBirth()).getYears()) ;
		
	}

	
	public void affichage() {
		
		 System.out.print(Prenom+"\t "+nom+"\t "+ab.getBirth()+"\t\t "+matricule+"\t\t\t"+moy()+"\t\t\t"+age());
		
	}
	

}
