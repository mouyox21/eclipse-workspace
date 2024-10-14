package ma.projet.bean;

import ma.projet.Personne;

public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developpeur A = new Developpeur(22,"LACHGAR","Mohammed","am@projet.ma","06123345678",10000,"PHP");
		A.afficher();
		Manager B = new Manager(22,"Salim","Karim","SK@projet.ma","06123345678",30000,"Informatique");
		B.afficher();
	}

}
