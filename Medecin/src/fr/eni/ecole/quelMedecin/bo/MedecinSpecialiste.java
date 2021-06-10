package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin{
	//private static final int NOMBRE_CRENEAUX_MAX = 15;
	/*private String nom;
	private String prenom;
	private String numeroTel;	
	private Adresse adresseMed;	*/
	private int tarif = 0;//tarif d'une consultation
	//private Creneau[] creneauMed= new Creneau[NOMBRE_CRENEAUX_MAX];
	//private int indicePremiereCaseLibre=0;
	private String specialite;
	
	public MedecinSpecialiste(String nom, String prenom, String numeroTel, Adresse adresseSpe, String specialite, int tarif) {
		super(nom,prenom,numeroTel,adresseSpe);
		this.specialite = specialite;
		this.tarif = tarif;
	}

	public MedecinSpecialiste( String nom, String prenom,String numeroTel,Adresse adresseMed, String specialite, int tarif, Creneau[] creneauMed){
		super(nom,prenom,numeroTel,adresseMed,creneauMed);
		this.specialite = specialite;
		this.tarif = tarif;
	}	

	
	/*public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNumeroDeTelephone() {
		return numeroTel;
	}
	
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Adresse getAdresseMed() {
		return adresseMed;
	}
	
	public void setAdresseMed(Adresse adresseMed) {
		this.adresseMed = adresseMed;
	}
	
	*/
	public int getTarif() {
		return tarif;
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public void afficher(){
				System.out.format("%s %s \nTéléphone: %s \nSpécialité : %s\nTarif : %d€\n", getNom(),getPrenom(),getNumeroDeTelephone(),getSpecialite(),getTarif());
				if(adressePers != null) {
					this.adressePers.afficher();		//pas besoin d'utiliser printf println ou format pour afficher les données d'adresse du médecin il suffit de chercher l'adresse courante avec this et de lier celle-ci avec la fonction afficher de la classe adresse	
				}
				if(indicePremiereCaseLibre!=0) {
					System.out.format("\nCréneaux  :\n");							
					for(int indiceCreneau=0; indiceCreneau < indicePremiereCaseLibre;indiceCreneau++) {
						this.creneauMed[indiceCreneau].afficher();
					}					
				}
	}
		
	/*public  void  ajouterCreneau(Creneau creneauAAjouter){
	// S'assurer que ce medecin est bien le proriétaire du créneau (= le médecin que le créneau connait)
		// Ajouter un creneau que s'il reste de la place dans le tableau
		System.out.println("entree dans la boucle ajouterCreneau");
		if ( (this == creneauAAjouter.getSpecialiste()) &&  (indicePremiereCaseLibre < NOMBRE_CRENEAUX_MAX))
		{			
			System.out.println("entree dans le if de la boucle ajouterCreneau");
			this.creneauMed[indicePremiereCaseLibre]=creneauAAjouter;
			indicePremiereCaseLibre++;
		}		
	}*/

}
