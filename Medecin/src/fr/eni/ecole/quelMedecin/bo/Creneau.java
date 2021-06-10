package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {
	LocalTime heureDebut;
	int duree;//en minutes
	//MedecinGeneraliste medecinGeneralisteAssoc;
	//MedecinSpecialiste specialisteAssoc;
	Medecin medecinAssoc;
	
	/*public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecinGeneralisteAssoc){
		this.heureDebut=heureDebut;
		this.duree=duree;
		this.medecinGeneralisteAssoc=medecinGeneralisteAssoc;
		medecinGeneralisteAssoc.ajouterCreneau(this);
	}

	public Creneau(LocalTime heureDebut, int duree, MedecinSpecialiste specialisteAssoc) {
		// TODO Auto-generated constructor stub
		this.heureDebut=heureDebut;
		this.duree=duree;
		this.specialisteAssoc=specialisteAssoc;
		specialisteAssoc.ajouterCreneau(this);
	}*/

	public Creneau(LocalTime heureDebut, int duree, Medecin medecinAssoc) {
		// TODO Auto-generated constructor stub
		this.heureDebut=heureDebut;
		this.duree=duree;
		this.medecinAssoc=medecinAssoc;
		medecinAssoc.ajouterCreneau(this);
	}	
	
	public LocalTime getHeureDebut(){
	return this.heureDebut;	
	}
	
	public int getDuree(){
		return this.duree;
	}
	
	/*public  MedecinGeneraliste getGeneraliste(){
		return this.medecinGeneralisteAssoc;	
	}
	
	public MedecinSpecialiste getSpecialiste() {
		return specialisteAssoc;
	}*/
	public Medecin getMedecin() {
		return medecinAssoc;
	}
	/*public void setSpecialisteAssoc(MedecinSpecialiste specialisteAssoc) {
		this.specialisteAssoc = specialisteAssoc;
	}
	public void setGeneralisteAssoc(MedecinSpecialiste specialisteAssoc) {
		this.specialisteAssoc = specialisteAssoc;
	}*/

	public void setMedecinAssoc(Medecin medecinAssoc) {
		this.medecinAssoc = medecinAssoc;
	}

	public void setHeureDebut(LocalTime heureDebut){
		this.heureDebut=heureDebut;
	}

	public void setDuree(int duree){
		this.duree=duree;				
		}	
	
	public void afficher() {//affiche horaire du créneau et sa duree
		LocalTime heureFin=heureDebut.plusMinutes(getDuree());
		System.out.println(getHeureDebut()+" - "+" "+heureFin+" ("+getDuree()+" minutes)");			
		
	}

}
