package HERITAGE_BANK;

public class ComptePayant extends Compte {
	
	public ComptePayant(float solde) {
		super(solde);
	}
	public void verser(float mt) {
		float r;
		mt=mt-(mt*5/100);
		r = mt+getSolde();
		setSolde(r);
	}
	public void retirer(float mt) {
		super.retirer(mt);
	}
	public String toString() {
		return super.toString();
	}

}
