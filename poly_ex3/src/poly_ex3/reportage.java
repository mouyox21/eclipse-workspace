package poly_ex3;

import java.util.Scanner;

public class reportage extends emission {
	protected String themes;
	public reportage(String Nom) {
		Scanner sc = new Scanner(System.in);
		nom = Nom;
		int ch;
		duree = 1;
		System.out.println("choisir le theme de reportage : ");
		System.out.println("1- information \n2- animalier \n3- culturel");
		ch = sc.nextInt();
		if(ch==1) {
			themes = "information";
		}else if(ch == 2) {
			themes ="animalier";
		}else if(ch == 3) {
			themes ="culturel";
		}else {
			System.out.println("theme indefini!!!");
			themes = "indefini";
		}
		do {
			System.out.println("donner l'heure de debut : ");
			hd = sc.nextInt();
		} 
		while((hd<14||hd>18)&&(hd<0||hd>6)) ;
		
		hf = hd+duree;
		if(hf>=24) {
			hf=hf-24;
		}
		
	}
	public String toString() {
		return hd+"h - "+hf+"h \tNom d'emission : "+nom+" Theme d'emission : "+themes+" Duree d'emission : "+duree;
	}

}
