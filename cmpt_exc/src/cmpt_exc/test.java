package cmpt_exc;

import java.util.InputMismatchException;
import java.util.Scanner;

import cmpt_exc.compte.MontantNegatifException;
import cmpt_exc.compte.SoldeinsuffisantException;

public class test {

	public static void main(String[] args) {
		compte A = new compte();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("montant a verser");
			float D = sc.nextFloat(); 
			A.verser(D);
			System.out.println("Montant actuell est : "+A.getSolde());
			
			System.out.println("montant a retirer");
			float R = sc.nextFloat();
			A.retirer(R);
			
		} catch (SoldeinsuffisantException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}catch (InputMismatchException e) {
			System.out.println("probleme de saisie !!!");
			// TODO: handle exception
		}catch (MontantNegatifException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("solde finale : "+A.getSolde());
		

	}

}
