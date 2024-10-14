package poly_ex3;

import java.util.Iterator;



public class télé {
	public static void tri(emission [] l,int b)
	{
		int min;
		int pmin;
		emission  tri ;
		for  (int i = 0; i<b;i++)
		{
			min = l[i].hd;
			pmin = i;
			for (int j = 0; j<b-1;j++) {
				if (min > l[j].hd)
		        {
		            min = l[j].hd;
		            pmin = j;

		            tri = l[i];
		            l[i] = l[pmin];
		            l[pmin] = tri;

		        }
				
			}
		}
		
		
	}
		
	public static void main(String[] args) {

		emission [] E = new emission[5];
		int [] h = new int [23];
		E[0]=new divertissement("anime", "amlik");
		E[2]= new fiction("alb", "rayan", 2002, false, 3);
		E[1]=new reportage("alladin");
		System.out.println(E[0]);
		System.out.println("------------------");
		System.out.println(E[2]);
		System.out.println("------------------");
		System.out.println(E[1]);
		 //tri(E, 4);
		 System.out.println("---------------------------------------------");
		 for (int i = 0; i < 3; i++) {
			System.out.println(E[i]);
		}
		
		
	}

}
