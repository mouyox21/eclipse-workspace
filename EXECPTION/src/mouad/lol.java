package mouad;

public class lol {
	 public static float div(int a,int b) {
		if (b == 0) { throw new stop();
		}
		return (float) a/b;
	}
	

	public static void main(String[] args) {
		try {
			System.out.println("div = "+div(3, 2));
			System.out.println("div = "+div(3, 0));
			
		} catch (stop e) {
		}
		System.out.println("hello");

	}
	
	
}
class stop extends RuntimeException {
	public stop() {
		System.out.println("erreur de zero");
	}
}
