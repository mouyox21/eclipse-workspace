package rect;

public class square extends Rectangle {
	 square(int cote){
		super(cote,cote);
	}
	public int getSideLength() {
		return super.getLa();
	}

}
