package tp_abstrait_2;

public class test {

	public static void main(String[] args) {
		Profile A = new Profile("CP", "Chef de projet");
		Profile B = new Profile("MN", "Manager");	
		Profile C = new Profile("DP", "Directeur de projet");
		Profile D = new Profile("DRH", "Directeur des ressources humaines");
		Profile E = new Profile("DG", "Directeur général");
		utilisateurs util[] = new utilisateurs[3];
		 util[0] = new utilisateurs("amine", "rabii", "am@am.com", "06661188", 30000, "test", "pass", "alik", B);
		 util[1] = new utilisateurs("ali","amlik","mmm@ùùù.com","06676544",2000,"log","pass","salik",E);
		util[0].affiche();
		util[1].affiche();
		System.out.println("-------------------------------------------------------------");
		for (int i = 0;i<2;i++) {
			if (util[i].p == B) {
				util[i].affiche();
			}
		}

	}

}
