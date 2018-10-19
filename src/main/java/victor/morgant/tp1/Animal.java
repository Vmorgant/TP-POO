package victor.morgant.tp1;
public abstract class Animal {
	private String nom;
	private TypeAnimal type;
	public String getNom() {
		return nom;
	}
	public TypeAnimal getType() {
		return type;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setType(TypeAnimal type) {
		this.type = type;
	}
	

}
