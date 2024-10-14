package exam_ex_2;

class Etudiant {
	  private String nom;
	  private double[] notes;
	  private int age;

	  public Etudiant(String nom, double[] notes, int age) {
	    this.nom = nom;
	    this.notes = notes;
	    this.age = age;
	  }

	  
	  public double Moyenne() {
	    double somme = 0.0;
	    for (int i = 0; i < notes.length; i++) {
	      somme += notes[i];
	    }
	    return somme / notes.length;
	  }

	  
	  public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void afficher() {
	    System.out.println("Nom de l'étudiant : " + nom);
	    System.out.println("Moyenne de l'étudiant : " + Moyenne());
	  }
	}
