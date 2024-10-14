package heritage;

public class program {

	public static void main(String[] args) {
		point2d B= new point2d(2, 2);
		B.toString();

		point3d A = new point3d(2, 6, 9);
		A.deplacer(1, 1, 1);
		System.out.println(A.toString());

	}

}
