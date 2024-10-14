package prepa;

import java.util.Iterator;

public class Etudiant {
	private String Nom;
	private int age;
	private double Note[] = new double[10];
	 public Etudiant(String Nom,int age,double[] Note ) {
		 this.Nom =Nom;
		 this.age=age;
		 this.Note = Note;
		
	}
	public double Moyenne() {
		 double s=0;
		 for (int i = 0; i < Note.length; i++) {
			 s += Note[i];
		}
		 return s/Note.length;
		
	}
	 public void afficher() {
		 System.out.println("l'etudiant : "+Nom+" a la moyenne :"+Moyenne());
		
	}
	


}
