package HERITAGE_BANK;

public class CompteSimple extends Compte {
	float dec;
	
	public CompteSimple(float Solde,float dec) {
		super(Solde);
		this.dec=dec;
	}
	public void retirer(float mt) {
		float r;
		if(mt<=(dec+getSolde())) {
			///////////////////
			if (mt<=getSolde()) {
				super.retirer(mt);
			}else {
				r=getSolde()+dec-mt;
				dec=r;
				setSolde(0);
			}
			///////////////
		}else {
			System.out.println("Solde insuffisant");
		}
	}
	
	public String toString() {
		return super.toString()+" decouvert : "+dec;
	}
	

}
