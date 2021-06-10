package fr.eni.ecole.quelMedecin.bo;



public class Adresse {
	
	//Affichage final attendu
	//2B rue Benjamin Franklin
	//44800 SAINT HERBLAIN
	
	//Creation de 2 Constructeurs

	private String mentionsComplementaires;	
	private int numVoie;
	private String complementVoie=null;
	private String nomVoie;
	private int codePostal;
	private String nomCommune;//toUpperCase()


	//Un avec toutes les infos
	public Adresse(String mentionsComplementaires,int numVoie,String complementVoie,String nomVoie,int codePostal,String nomCommune){
		this.mentionsComplementaires=mentionsComplementaires;		
		this.numVoie=numVoie;
		this.complementVoie=complementVoie;
		this.nomVoie=nomVoie;
		this.codePostal=codePostal;
		this.nomCommune=nomCommune;

	}

	//Un sans les informations complémentaires passées à null
	public Adresse(int numVoie,String complementVoie,String nomVoie,int codePostal,String nomCommune){	
		this.numVoie=numVoie;
		this.complementVoie="";
		this.nomVoie=nomVoie;
		this.codePostal=codePostal;
		this.nomCommune=nomCommune;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

	}
	
	public String getMentionsComplementaires(){
	return this.mentionsComplementaires;	
	}
	
	public void afficher() {

		if(getMentionsComplementaires()!= null) {		
			System.out.format("Adresse:\n%s\n%d%s %s\n%05d %s \n", getMentionsComplementaires(), getNumVoie(), getComplementVoie(), getNomVoie(), getCodePostal(), getNomCommune());		

		}else {
			System.out.format("Adresse:\n%d%s %s\n%05d %s \n", getNumVoie(), getComplementVoie(), getNomVoie(), getCodePostal(), getNomCommune());				
		}
	}
	



	public int getNumVoie(){
	return this.numVoie;	
	}
	
	public String getComplementVoie(){
		return this.complementVoie;
	}
	
	public  String getNomVoie(){
		return this.nomVoie;	
	}

	public  int  getCodePostal(){
		return this.codePostal;	
	}		
	public  String  getNomCommune(){
		return this.nomCommune.toUpperCase();	
	}		

	public void setMentionsComplementaires(String mentionsComplementaires){
		this.mentionsComplementaires=mentionsComplementaires;
	}
	
	public void setNumVoie(int numVoie){
		this.numVoie=numVoie;
	}		
	
	public void setComplementVoie(String complementVoie){
		this.complementVoie=complementVoie;
	}

	public void setNomVoie(String nomVoie){
		this.nomVoie=nomVoie;				
		}	
	
	public void setCodePostal(int codePostal){
		this.codePostal=codePostal;
	}
	
	public void setNomCommune(String nomCommune){
		this.nomCommune=nomCommune;
	}	
	
}
