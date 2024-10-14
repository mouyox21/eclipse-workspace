package ma.projet;

public abstract class Personne {
	protected int id;
	protected String nom,prenom,mail,telephone;
	protected double salaire;
	public Personne(int id,String nom,String prenom,String mail,String telephone,double salaire ) {
		this.id=id;
		this.mail=mail;
		this.nom=nom;
		this.prenom = prenom;
		this.telephone=telephone;
		this.salaire=salaire;
	}
	
	public abstract double calculerSalaire();
	
	

}
