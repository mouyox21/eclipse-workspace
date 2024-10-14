package ma.projet.bean;

import ma.projet.Personne;

public class Developpeur extends Personne {
	protected String speialite;
	public Developpeur(int id,String nom,String prenom,String mail,String telephone,double salaire,String speialite) {
		super(id,nom,prenom,mail,telephone,salaire);
		this.speialite=speialite;
	}
	
	public double calculerSalaire() {
		return salaire + (salaire*0.2);
	}
	public void afficher() {
		System.out.println("Le salaire du Developeur "+nom+" "+prenom+" est "+calculerSalaire()+" dh, son service : "+speialite);
	}
}
