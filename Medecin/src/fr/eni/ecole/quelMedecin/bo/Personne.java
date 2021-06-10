package fr.eni.ecole.quelMedecin.bo;


public class Personne{

	protected String nom;
	protected String prenom;
	protected String numeroTel;
	protected Adresse adressePers;		
	
	public Personne(String nom, String prenom, String numeroTel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTel = numeroTel;
	}
		
	public Personne(String nom, String prenom, String numeroTel, Adresse adressePers) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTel = numeroTel;
		this.adressePers = adressePers;
	}
	
	// Format 2 juin 1995 et non 02 juin 1995
	public void afficher() {
	//mise en forme de la date de naissance
	// DateTimeFormatter;
		if(getAdressePers()==null) {
			System.out.format(
					" %s %s \n Téléphone : %s \n",
					getNom(), 
					getPrenom(), 
					getNumeroDeTelephone() 
					);				
		}else {
			System.out.format(getNom()+" "+getPrenom()+"\nTéléphone : "+getNumeroDeTelephone()+"\nAdresse: \n");
			this.adressePers.afficher();
		}
	}
	


	public String getNom() {
		return this.nom.toUpperCase();
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNumeroDeTelephone() {
		// TODO Auto-generated method stub
		return this.numeroTel;
	}
	
	public void setNumeroDeTelephone(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	
	public Adresse getAdressePers() {
		return this.adressePers;
	}
	
	public void setAdressePers(Adresse adressePers) {
		this.adressePers = adressePers;
	}

	
}
