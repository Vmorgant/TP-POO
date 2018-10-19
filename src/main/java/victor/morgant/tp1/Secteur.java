package victor.morgant.tp1;

import java.util.ArrayList;

public class Secteur {
	public Secteur(TypeAnimal type) {
		this.type = type;
	}
	TypeAnimal type;
	ArrayList<Animal> animaux=new ArrayList<Animal>();;
	
	void AjouterAnimal(Animal a) {
		if(a.getType()==type) {
			animaux.add(a);
		}
	}
	int getNombreAnimaux() {
		return(animaux.size());
	}
	TypeAnimal getType() {
		return(type);
	}
}
