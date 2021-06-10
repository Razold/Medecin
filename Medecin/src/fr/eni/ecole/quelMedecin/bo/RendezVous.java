package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
	 Creneau creneauRDV;
	 Patient patientRDV;
	 LocalDate dateRDV;
	 Medecin medecinRDV;
	// MedecinGeneraliste medecinRDV;
	// MedecinSpecialiste medecinSpeRDV;
	 
	 public RendezVous(Creneau creneauRDV, Patient patientRDV, LocalDate dateRDV){
		 this.creneauRDV=creneauRDV;
		 this.patientRDV=patientRDV;
		 this.dateRDV=dateRDV;		 
	 }
	 
	 public void afficher() {
		 //				System.out.format("%s %s \nTéléphone: %s \nTarif : %d€\nAdresse:", getNom(),getPrenom(),getNumeroDeTelephone(),getTarif());
		 //this.adresseMed.afficher();		//pas besoin d'utiliser printf println ou format pour afficher les données d'adresse du médecin il suffit de chercher l'adresse courante avec this et de lier celle-ci avec la fonction afficher de la classe adresse	
		String dateRDVFormatee = getDateRDV().format(  DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG) ) ;
		 System.out.printf("Rendez-vous du "+dateRDVFormatee+" ");
		 this.creneauRDV.afficher();
		// if(this.creneauRDV.getMedecin()!= null) {
			 System.out.printf("avec le DR "+this.creneauRDV.getMedecin().getNom());		 
		 /*}else {
			 System.out.printf("avec le DR "+this.creneauRDV.getSpecialiste().getNom());			 
		 }*/
		 
		 System.out.printf("\npour ");
		 this.patientRDV.afficher();

	 }



	public void setCreneauRDV(Creneau creneauRDV) {
		this.creneauRDV = creneauRDV;
	}

	public void setPatientRDV(Patient patientRDV) {
		this.patientRDV = patientRDV;
	}

	public void setDateRDV(LocalDate dateRDV) {
		this.dateRDV = dateRDV;
	}

	private LocalDate getDateRDV() {
		// TODO Auto-generated method stub
		return this.dateRDV;
	}

	private Creneau getCreneauRDV() {
		
		return this.creneauRDV;
	}
	private Patient getPatientRDV() {
		// TODO Auto-generated method stub
		return this.patientRDV;
	}
	
	private Medecin getMedecinRDV() {
		
		return this.medecinRDV;
	}	
	/*public MedecinSpecialiste getMedecinSpeRDV() {
		return medecinSpeRDV;
	}
	
	private MedecinGeneraliste getMedecinRDV() {
		
		return this.medecinRDV;
	}*/
}
