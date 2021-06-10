package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste extends Medecin{

	private static final int MONTANT_CONSULTATION = 25;
	//private static final int NOMBRE_CRENEAUX_MAX = 15;
	/*private String nom;
	private String prenom;
	private String numeroTel;	
	private Adresse adresseMed;	*/
	private static int tarif = MONTANT_CONSULTATION;//tarif d'une consultation

	//private Creneau[] creneauMed= new Creneau[NOMBRE_CRENEAUX_MAX];
	//private int indicePremiereCaseLibre=0;


	public MedecinGeneraliste( String nom, String prenom,String numeroTel){
		super(nom,prenom,numeroTel);

	}
	
	public MedecinGeneraliste( String nom, String prenom,String numeroTel,Adresse adresseMed){
		super(nom,prenom,numeroTel,adresseMed);

	}
	
	public MedecinGeneraliste( String nom, String prenom,String numeroTel,Adresse adresseMed, Creneau[] creneauMed){
		super(nom,prenom,numeroTel,adresseMed);
		this.creneauMed=creneauMed;
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
	public void setNumeroDeTelephone(String numeroTel){
		this.numeroTel=numeroTel;
	}
	
	public Adresse getAdresseMedecin(){
		return this.adresseMed;	
	}
	
	public void setAdresseMedecin(Adresse adresseMed){
		this.adresseMed=adresseMed;
	}
	*/
	public int getTarif(){
		return tarif;	
	}
	
	public static void setTarif(int newTarif){
		
		tarif=newTarif;
	}
/*
	public Creneau[] getCreneauMedecin(){
		return this.creneauMed;	
	}
	
	public void setCreneauMedecin(Creneau[] creneauMed){
		this.creneauMed=creneauMed;
	}*/
	@Override
	public void afficher(){
				System.out.format("%s %s \nTéléphone: %s \nTarif : %d€\n", getNom(),getPrenom(),getNumeroDeTelephone(),getTarif());
				if(adressePers != null) {
					this.adressePers.afficher();		//pas besoin d'utiliser printf println ou format pour afficher les données d'adresse du médecin il suffit de chercher l'adresse courante avec this et de lier celle-ci avec la fonction afficher de la classe adresse	
				}

				if(indicePremiereCaseLibre!=0) {
					System.out.format("\nCréneaux  :\n");							
					for(int indiceCreneau=0; indiceCreneau < indicePremiereCaseLibre;indiceCreneau++) {
						this.creneauMed[indiceCreneau].afficher();
					}					
				}
	}/*
		
	public  void  ajouterCreneau(Creneau creneauAAjouter){
		// S'assurer que ce medecin est bien le proriétaire du créneau (= le médecin que le créneau connait)
		// Ajouter un creneau que s'il reste de la place dans le tableau

		if ((this == creneauAAjouter.getGeneraliste()) &&  (indicePremiereCaseLibre < NOMBRE_CRENEAUX_MAX))
		{
			this.creneauMed[indicePremiereCaseLibre]=creneauAAjouter;
			indicePremiereCaseLibre++;
		}		
	}*/

	

}
