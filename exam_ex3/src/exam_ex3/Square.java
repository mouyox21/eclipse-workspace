package exam_ex3;

public class Square extends Rectangle {
	  public Square(int sideLength) {
		    super(sideLength, sideLength);
		  }

		  public int getSideLength() {
		    return this.getWidth();
		  }
}
