package HERITAGE_BANK;
public class Compte {
	private int code;
	protected float Solde;
	private static int nbcompte=1;
	public Compte(float Solde) {
		code=nbcompte;
		this.Solde = Solde;
		nbcompte++;
	}
	public void verser(float mt) {
		Solde = mt+Solde;
	}
	public void retirer(float mt) {
		if (mt<=Solde) {
			Solde = Solde - mt;
		}else {
			System.out.println("Solde insuffisant");
		}
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return Solde;
	}
	public void setSolde(float solde) {
		Solde = solde;
	}
	public static int getNbcompte() {
		return nbcompte;
	}
	public static void setNbcompte(int nbcompte) {
		Compte.nbcompte = nbcompte;
	}
	
	public String toString() {
		return "Code : "+code+" Solde : "+Solde;
	}

}
