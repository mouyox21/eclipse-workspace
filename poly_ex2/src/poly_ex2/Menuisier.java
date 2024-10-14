package poly_ex2;

public class Menuisier extends Personne {
	Menuisier(String nom){
		this.nom = nom;
	}
	public void affiche() {
		System.out.println("Je suis "+nom+" le Menuisier");
	}

}
