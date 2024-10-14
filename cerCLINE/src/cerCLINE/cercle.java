package cerCLINE;

import jqvq.point;

public class cercle {
	int x,y;
	double r;
	point b;
	point o;
	
	cercle(point centre,point c){
		b = centre;
		o = c;
		r=Math.sqrt((Math.pow((b.getX()-o.getX()), 2)+(Math.pow((b.getY()-o.getY()), 2))));
	}
cercle(){
	System.out.println("Donner le point de centre : ");
	point centre = new point ();
	System.out.println("Donner le point de rayon  : ");
	point c = new point ();
	b = centre;
	o=c;
	r=Math.sqrt((Math.pow((b.getX()-o.getX()), 2)+(Math.pow((b.getY()-o.getY()), 2))));
	
}
cercle(point centre,int c){
	b=centre;
	r = c;
}
public double surface() {  
	 return Math.PI * r *r;
}


public double perimetre() {
	 return Math.PI * 2 *r; 
}
public boolean appartient(point p) {
	double dis;
    dis = Math.Sqrt(Math.Pow(b.X - p.X, 2) + Math.Pow(b.Y - p.Y, 2));   

    if (dis <= r)
        return true;
    else
        return false;


}

}
