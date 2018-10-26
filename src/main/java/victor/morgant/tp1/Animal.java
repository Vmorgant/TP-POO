package victor.morgant.tp1;

import org.apache.logging.log4j.LogManager ;
import org.apache.logging.log4j.Logger ;
public abstract class Animal {
	private String nom;
	private TypeAnimal type;
	static final Logger logger=LogManager.getLogger(Animal.class);
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
