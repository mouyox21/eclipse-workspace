package poly_ex2;

public class TestMetiers {

	public static void main(String[] args) {
		Personne[ ] personnes = new Personne[3] ;
		personnes [ 0 ] = new Menuisier( "Paul" ) ;
		personnes [ 1 ] = new Plombier( "Jean" ) ;
		personnes [ 2 ] = new Menuisier( "Adrien" ) ;
		for( int i=0 ; i< personnes.length ; i++ ) personnes[i].affiche() ;

	}

}
