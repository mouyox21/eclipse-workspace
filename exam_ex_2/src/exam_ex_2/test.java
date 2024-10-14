package exam_ex_2;

public class test {

	public static void main(String[] args) {
		Etudiant[] etudiants = new Etudiant[5];

	    etudiants[0] = new Etudiant("Laila", new double[] {12, 15, 13, 16, 18}, 21);
	    etudiants[1] = new Etudiant("Sami", new double[] {14, 13, 15, 11, 16}, 20);
	    etudiants[2] = new Etudiant("houssam", new double[] {10, 12, 14, 16, 18}, 22);
	    etudiants[3] = new Etudiant("Amine", new double[] {11, 13, 15, 17, 19}, 23);
	    etudiants[4] = new Etudiant("Mouad", new double[] {16, 18, 14, 16, 20}, 21);

	    for (int i=0;i<etudiants.length;i++) {
	      System.out.println("Age de l'étudiant : " + etudiants[i].getAge());
	      System.out.println("Moyenne : " + etudiants[i].Moyenne());
	    }

	    Etudiant etudiantMax = etudiants[0];
	    for (int i = 1; i < etudiants.length; i++) {
	      if (etudiants[i].Moyenne() > etudiantMax.Moyenne()) {
	        etudiantMax = etudiants[i];
	      }
	    }

	    System.out.println("L'étudiant ayant la meilleure moyenne est : " + etudiantMax.getNom());
	  }

	}


