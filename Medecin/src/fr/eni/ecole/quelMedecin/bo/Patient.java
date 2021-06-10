package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;;

public class Patient extends Personne{

	// Un patient est caractérisé par son nom, prénom, numéro de téléphone, sexe (F
	// Un patient est caractérisé par son nom, prénom, numéro de téléphone,
	// ou M), son numéro de sécurité sociale (entier long), sa date naissance de
	// type LocalDate)
	// et éventuellement de commentaires (allergie, antécédents médicaux)

	/*private String nom;
	private String prenom;
	private String numeroTel;
	private Adresse adressePat;*/
	private char sexe;
	private Long numeroSecu;
	private LocalDate dateDeNaissance;
	private  String commmentaires;
	private static final String LIBELLE_AUCUN_COMMENTAIRE ="[aucun commentaire]";


//format constructeur:String, String, String, char, long, LocalDate, String
	//format constructeur:String, String, String, char, long, LocalDate, String
		public Patient(String nom, String prenom, String numeroTel, char sexe, Long numeroSecu, LocalDate dateDeNaissance,
				String commmentaires) {
			
			super(nom,prenom,numeroTel);
			this.sexe = sexe;
			this.numeroSecu = numeroSecu;
			// Convertir la date de 02/06/1995 en 2 juin 1995
			this.dateDeNaissance = dateDeNaissance;
			this.commmentaires = commmentaires;
		}
		
	public Patient(String nom, String prenom, String numeroTel, char sexe, Long numeroSecu, LocalDate dateDeNaissance,
			String commmentaires,Adresse adressePat) {
		
		super(nom,prenom,numeroTel,adressePat);
		this.sexe = sexe;
		this.numeroSecu = numeroSecu;
		// Convertir la date de 02/06/1995 en 2 juin 1995
		this.dateDeNaissance = dateDeNaissance;
		this.commmentaires = commmentaires;
	}
	


	/*public LocalDate ofLocalizedDateTime(LocalDate dateSaisie) {
		LocalDate nouvelleDate=LocalDate dateStyle;
		return nouvelleDate;
	}*/

	// Format 2 juin 1995 et non 02 juin 1995
	@Override
		public void afficher() {	
		//mise en forme de la date de naissance
			String dateDeNaissanceFormatee = getDateDeNaissance().format(  DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG) ) ;
		// DateTimeFormatter;
			if(getAdressePers()==null) {
				System.out.format(
						" %s %s \n Téléphone : %s \n Sexe : %s\n Numéro de Sécurité sociale : %d \n Date de naissance : %s \n Commentaires : %s\n",
						getNom(), 
						getPrenom(), 
						getNumeroDeTelephone(), 
						getSexeLibelle(),
						getNumeroSecu(), 
						dateDeNaissanceFormatee,
						 (getCommentaires()==null) ? LIBELLE_AUCUN_COMMENTAIRE : getCommentaires()		
							);				
			}else {
				System.out.format(getNom()+" "+getPrenom()+"\nTéléphone : "+getNumeroDeTelephone()+" \nSexe : "+getSexeLibelle()+"\nNuméro de Sécurité sociale : "+getNumeroSecu()+" \nDate de naissance : "+dateDeNaissanceFormatee +" \nCommentaires : "+ ((getCommentaires()==null) ? LIBELLE_AUCUN_COMMENTAIRE : getCommentaires())+"\n");
				this.adressePers.afficher();
			}
		}
		
		/*public String getNom(){
			return this.nom.toUpperCase();		
		}
		
		public String getPrenom(){
		return this.prenom;	
		}
		
		public String getNumeroDeTelephone(){
			return this.numeroTel;
		}

		public void setNom(String nom){
			this.nom=nom;
		}
		
		public void setPrenom(String prenom){
			this.prenom=prenom;
		}		
		public void setNumeroDeTelephone(String numeroTel){
			this.numeroTel=numeroTel;
		}
		
			
		public Adresse getAdressePatient(){
			return this.adressePat;	
			}
			
		public void setAdressePatient(Adresse adressePat){
			this.adressePat=adressePat;
		}
		*/
		
		public  char getSexe(){
			return this.sexe;	
		}

		public  Long  getNumeroSecu(){
			return this.numeroSecu;	
		}
		
		public  LocalDate  getDateDeNaissance(){
			return this.dateDeNaissance;	
		}		

		public  String getCommentaires(){
			return this.commmentaires;	
		}
			
		public void setSexe(char sexe){
			if(sexe=='F'||sexe=='M') {
				this.sexe=sexe;				
			}
		}	
		
		public void setNumeroSecu(Long numeroSecu){
			this.numeroSecu=numeroSecu;
		}
		
		public void setCommmentaires(String newCommmentaires){
			this.commmentaires=newCommmentaires;
		}	
		
		public  String getSexeLibelle(){
			String resultat=null;
			
			switch(getSexe()) {
			case 'F': resultat="Féminin";break;
			case 'M': resultat="Masculin";break;
			}
			return resultat;
		}
		

}
