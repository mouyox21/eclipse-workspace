package heritage;

public class point3d extends point2d {
	int z;
	public point3d(int x,int y,int z) {
		super(x, y);
		this.z=z;
	}
	public void deplacer(int dx,int dy,int dz) {
		super.deplacer(dx, dy);
		z = z + dz;
	}
	
	public String toString() {
		return super.toString()+"Z: "+z;
	}

}
