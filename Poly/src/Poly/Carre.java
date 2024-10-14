package Poly;

public class Carre extends Forme {
	
	public Carre(double r) {
		surface = Math.floor(r*r);
		this.r=r;
	}
	public String toString(){ 
		return ("carre (coté"+r+" cm²)");
		
	}

}
