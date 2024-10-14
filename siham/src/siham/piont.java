package siham;

public class piont {
	int x, y ;
	piont(int a,int b){
		x=a;
		y=b;
		
	}
	
public void afficher() {
	System.out.println("les corrdonese sont :" +x+" et "+y);
}
public void dep(int dx , int dy) {
	dx+=x;
	dy+=y;
	
	System.out.println("les corrdonese 2222 sont :" +dx+" et "+dy);
}

}
