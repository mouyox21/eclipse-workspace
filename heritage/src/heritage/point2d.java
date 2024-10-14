package heritage;

public class point2d {
	int x,y;
	point2d(int x, int y){
		this.x=x; this.y=y;
	}
	public void deplacer(int dx,int dy) {
		x = x + dx;
		y = y + dy;
	}
	public String toString() {
		return "X: "+ x +"Y: "+y;
	}

}
