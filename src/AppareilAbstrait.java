
public abstract class AppareilAbstrait implements InterfaceAppareil {

	private String categorie;
	private int tension;
	private double amperage;
	private int etat;
	private String emplacement;
	
	
	public AppareilAbstrait(String categorie, int tension, double amperage, int etat, String emplacement) {
		super();
		this.categorie = categorie;
		this.tension = tension;
		this.amperage = amperage;
		this.etat = etat;
		this.emplacement = emplacement;
	}


	public int isEtat() {
		return etat;
	}


	public void setEtat(int etat) {
		this.etat = etat;
	}


	public String getCategorie() {
		return categorie;
	}


	public int getTension() {
		return tension;
	}


	public double getAmperage() {
		return amperage;
	}


	public String getEmplacement() {
		return emplacement;
	}
	
	
	
	
	
	
	
}
