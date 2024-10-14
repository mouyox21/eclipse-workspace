package cmpt_exc;



public class compte {
	private int code;
	private float Solde;
	
	public void verser (float mt) {
		Solde = Solde + mt;
	}
	public void retirer(float mt) throws SoldeinsuffisantException,MontantNegatifException {
		
		if (mt<0)  throw new MontantNegatifException("montant" + mt + " est négatif");
			
		if (mt>Solde) throw new SoldeinsuffisantException("solde isuffisant");
		Solde = Solde - mt;
	}
		
	public float getSolde()
	{
		return Solde;
	}
	
	public class SoldeinsuffisantException extends Exception {
		public SoldeinsuffisantException(String message) {
			super(message);
		}}

	public class MontantNegatifException extends Exception {
		public MontantNegatifException(String message) {
			super(message);
		}
	}


}


