package ecole;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);
	private int mm,jj,aa;
	private LocalDate birth;
	Date(){
		
		do {
			 System.out.print("donner le jour de naissance : ");
			 jj = sc.nextInt();
			 
			 }while(jj<1 || jj>31);
			 
			 do {
			 System.out.print("donner le mois de naissance : ");
			 mm = sc.nextInt();
			 }while(mm<1 || mm>12);
			 System.out.print("donner l'annee de naissance : ");
			 aa = sc.nextInt();
			 
			 birth = LocalDate.of(aa,mm ,jj);
			 
	}
	Date (int jj,int mm,int aa){
		this.jj =jj;
		this.aa=aa;
		this.mm=mm;
		birth = LocalDate.of(aa,mm ,jj);
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getJj() {
		return jj;
	}
	public void setJj(int jj) {
		this.jj = jj;
	}
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	
	}


