package cerCLINE;

import java.util.Scanner;

public class point {
	Scanner sc = new Scanner(System.in);
	private int x,y;
	point(int a,int b){
		this.x = a;
		this.y=b;
	}
	point ()
	{
		System.out.print("Donner le x de point : ");
		x = sc.nextInt();
		System.out.print("Donner le y de point : ");
		y = sc.nextInt();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
