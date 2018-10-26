package victor.morgant.tp1;

import java.util.ArrayList;

public class Zoo {
	private int limiteVisiteur;
	private int visiteurs;
	public ArrayList<Secteur> secteursAnimaux;
	public Zoo(int plimiteVisiteur) {
		limiteVisiteur = plimiteVisiteur;
		visiteurs = 0;
		secteursAnimaux=new ArrayList<Secteur>();
	}

	public int getVisiteurs() {
		return visiteurs;
	}
	
	public int getLimiteVisiteur() {
		return limiteVisiteur;
	}
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if(visiteurs < limiteVisiteur)
			visiteurs++;
		else 
			throw new LimiteVisiteurException("La limite de visiteur est dépassée");
	}
	public void nouvelAnimal(Animal a) {
		for(Secteur s : secteursAnimaux) {
			if(s.getType()==a.getType()) {
				s.AjouterAnimal(a);
				Animal.logger.debug (" Nouvel animal : " +a.getClass().toString());
				Animal.logger.info (" Nouvel animal : "+a.getNom());
				Animal.logger.warn (" Nouvel animal : " +a.getClass().toString());
				Animal.logger.error (" Nouvel animal : " +a.getClass().toString());
				Animal.logger.fatal (" Nouvel animal : " +a.getClass().toString());
				Animal.logger.trace(" Nouvel animal : " +a.getClass().toString());
			}
		}
	}
	public int nombreAnimaux() {
		int nb=0;
		for(Secteur s : secteursAnimaux) {
			nb+=s.getNombreAnimaux();
		}
		return nb;
	}
	

}
