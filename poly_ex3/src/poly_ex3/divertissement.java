package poly_ex3;

import java.util.Scanner;

public class divertissement extends emission {
	protected String animateur;
	Scanner sc = new Scanner(System.in);
	public divertissement(String nom,String animateur) {
		this.animateur=animateur;
		this.nom=nom;
		duree =2;
		do {
			System.out.println("donner l'heure de debut : ");
			hd = sc.nextInt();
		} 
		while(hd<18||hd>23) ;
		hf=hd+duree;
		if(hf>=24) {
			hf=hf-24;
		}
	}
	public String toString() {
		return "Nom d'emission : "+nom+" Animateur : "+animateur+" Duree d'emission : "+duree+"h Date de debut : "+hd+" H Date de fin : "+hf+"H";
	}

}