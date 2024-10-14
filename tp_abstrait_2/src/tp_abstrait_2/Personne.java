package tp_abstrait_2;

public abstract class Personne {
	protected int id;
	static int idp=0;
	protected String nom,prenom,mail,telephone;
	protected double salaire;
	public Personne(String nom,String prenom,String mail,String telephone,double salaire ) {
		id=idp;
		this.mail=mail;
		this.nom=nom;
		this.prenom = prenom;
		this.telephone=telephone;
		this.salaire=salaire;
		idp++;
	}
	
	public abstract double calculerSalaire();
	public abstract void affiche();
	

}
