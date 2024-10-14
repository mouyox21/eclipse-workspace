package tp_abstrait_2;

public class utilisateurs extends Personne {
	protected String login,pass,service;
	protected Profile p;
	public utilisateurs(String nom,String prenom,String mail,String telephone,double salaire,String login,String pass,String service,Profile p) {
		super(nom,prenom,mail,telephone,salaire);
		this.pass=pass;
		this.login=login;
		this.service=service;
		this.p=p;
	}
	public double calculerSalaire() {
		if(p.libelle == "Manager" ||p.code == "MN" ) {
			return salaire + (salaire*0.15);
		}else if (p.libelle == "Directeur général " ||p.code == "DG") {
			return salaire + (salaire*0.3);
		}else return salaire;
	}
	
	public  void affiche() {
		System.out.println("Le salaire du "+p.libelle+ " "+nom+" "+prenom+" est "+calculerSalaire()+" dh, son service : "+service);

	}
}
