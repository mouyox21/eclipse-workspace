package HERITAGE_BANK;

public class CompteEpargne extends Compte {
	float taux;

	public CompteEpargne(float Solde,float taux) {
		super(Solde);
		this.taux = taux;

	}
	public float calculInterett()
	{
		return taux/100*super.getSolde();

	}
	public String toString() {
		return super.toString()+" taux d'Intérêt "+taux+"% calcul d'interet :  "+calculInterett();
	}

}
