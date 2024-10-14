package poly_ex3;

import java.util.Scanner;

public class fiction extends emission{
	Scanner sc = new Scanner(System.in);
	String nomrea;
	int annee;
	public fiction(String nomfilm,String nomrea,int annee,boolean redi,int duree) {
		this.duree=duree;
		nom = nomfilm;
		this.annee = annee;
		this.nomrea=nomrea;
		do {
			System.out.println("donner l'heure de debut : ");
			hd = sc.nextInt();
		} 
		while((hd<21||hd>23)&&(hd<0||hd>6)) ;
		if(redi) {
			System.out.println("rediffusion : ");
			do {
				System.out.println("donner l'heure de debut : ");
				hd2 = sc.nextInt();
			} 
			while((hd2<6||hd2>14)) ;
			hf2=hd2+duree;
			
		}else {hd2=0;hf2=0;}
		
		hf2=hd2+duree;
		hf = hd+duree;
		if(hf>=24) {
			hf=hf-24;
		}
	}
	public String toString() {
		return hd+"h - "+hf+"h \tNom d'emission : "+nom+" Realisateur : "+nomrea+" Annee : "+annee+ "Duree d'emission : "+duree+"H rediffusion "+hd2+"h à "+hf2+"h";
	}

}
