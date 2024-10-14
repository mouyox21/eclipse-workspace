package tp_abstrait_2;

public class Profile {
	static int id=0;
	int idp;
	private String code,libelle;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Profile(String code, String  libelle) {
		this.code=code;
		this.libelle=libelle;
		idp=id;
		id++;
	}
	
	

}
