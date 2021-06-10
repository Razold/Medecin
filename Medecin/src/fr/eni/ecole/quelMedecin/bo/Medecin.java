package fr.eni.ecole.quelMedecin.bo;

public class Medecin extends Personne{
	
	protected static final int NOMBRE_CRENEAUX_MAX = 15;
	//protected int tarif;//tarif d'une consultation
	protected Creneau[] creneauMed= new Creneau[NOMBRE_CRENEAUX_MAX];
	protected int indicePremiereCaseLibre=0;
	
	public Medecin( String nom, String prenom,String numeroTel){
		super(nom,prenom,numeroTel);

	}
	
	public Medecin( String nom, String prenom,String numeroTel,Adresse adresseMed){
		super(nom,prenom,numeroTel,adresseMed);
	}	
	
	public Medecin( String nom, String prenom,String numeroTel,Adresse adresseMed, Creneau[] creneauMed){
		super(nom,prenom,numeroTel,adresseMed);
		this.creneauMed=creneauMed;
	}
	
	public Creneau[] getCreneauMed() {
		return creneauMed;
	}
	
	public void setCreneauMed(Creneau[] creneauMed) {
		this.creneauMed = creneauMed;
	}
	
	/*public int getTarif() {
		return tarif;
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}*/
	
	
	/*public void afficher(){
		System.out.format("%s %s \nTéléphone: %s \nTarif: %d€\n", getNom(),getPrenom(),getNumeroDeTelephone(),getTarif());
		if(adressePers != null) {
			this.adressePers.afficher();		//pas besoin d'utiliser printf println ou format pour afficher les données d'adresse du médecin il suffit de chercher l'adresse courante avec this et de lier celle-ci avec la fonction afficher de la classe adresse	
		}
		if(indicePremiereCaseLibre!=0) {
			System.out.format("\nCréneaux  :\n");							
			for(int indiceCreneau=0; indiceCreneau < indicePremiereCaseLibre;indiceCreneau++) {
				this.creneauMed[indiceCreneau].afficher();
			}					
		}
	}*/
	/*public static void MedecinsetTarif(tarif) {
		
	}*/
	public  void  ajouterCreneau(Creneau creneauAAjouter){
	// S'assurer que ce medecin est bien le proriétaire du créneau (= le médecin que le créneau connait)
		// Ajouter un creneau que s'il reste de la place dans le tableau

		if ( (this == creneauAAjouter.getMedecin()) &&  (indicePremiereCaseLibre < NOMBRE_CRENEAUX_MAX))
		{			
			this.creneauMed[indicePremiereCaseLibre]=creneauAAjouter;
			indicePremiereCaseLibre++;
		}		
	}

}
