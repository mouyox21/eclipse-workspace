package HERITAGE_BANK;

public class programm {

	public static void main(String[] args) {
		CompteSimple A = new CompteSimple(3000, 2000);
		System.out.println(A.toString());
		A.retirer(4000);
		System.out.println(A.toString());
		System.out.println("-------------------------------------------");
		

		
		ComptePayant C = new ComptePayant(10000);
		System.out.println(C.toString());
		System.out.println("-------------------------------------------");
		C.verser(2000);
		System.out.println(C.toString());
		System.out.println("-------------------------------------------");
		C.retirer(5000);
		System.out.println(C.toString());
		System.out.println("-------------------------------------------");
		CompteEpargne T = new CompteEpargne(5000, 20);

		System.out.println(T.toString());

	}

}
