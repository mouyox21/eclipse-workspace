package Poly;

public class Cercle extends Forme {
	
	public Cercle(double r) {
		surface = Math.floor(r*r*Math.PI);
		this.r=r;
	}
	public String toString(){ 
		return ("Cercle (rayon"+r+" cm²)");
		
	}

}
