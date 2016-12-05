
public class AppareilVariateur extends AppareilAbstrait {

	private double variateur; 
	
	public AppareilVariateur(String categorie, int tension, double amperage, String emplacement, double variateur ) {
		super(categorie, tension, amperage, 0, emplacement);
		this.variateur=variateur;
	}

	@Override
	public boolean estVariateur() {
		return false;
	}

	@Override
	public double getPuissance() {
		return getTension()*getAmperage()*variateur;
	}

	@Override
	public int getEtat() {
		return variateur==0?Disjoncteur.ETEINT:Disjoncteur.ALLUME;
	}

}
