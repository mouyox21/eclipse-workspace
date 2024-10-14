package siham;

public class cercle {
	int x,y,r;
	double pi = 3.14;
	
	cercle(int a,int b,int c)
	{
		x=a;
		y=b;
		r=c;
	}

		public double surface()
		{
			double S;
			S = pi * r * r; 
			return S;
		}
		public double pericentre() {
			double P;
			P = 2 * pi * r;
			return P;
			
		}
		public void affichercercle() {
			System.out.println("les corrdonese du cercle sont : \n centre(" +x+" , "+y+")\n le rayon est : " +r);
			System.out.println("la surface est :" +surface());
			System.out.println("la pericentre et :" +pericentre());
		}
}
