package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {
	protected String service;
	public Manager(int id,String nom,String prenom,String mail,String telephone,double salaire,String service) {
		super(id,nom,prenom,mail,telephone,salaire);
		this.service=service;
	}
	public double calculerSalaire() {
		return salaire + (salaire*0.35);
	}
	public void afficher() {
		System.out.println("Le salaire du Manager "+nom+" "+prenom+" est "+calculerSalaire()+" dh, son service : "+service);
	}
}
