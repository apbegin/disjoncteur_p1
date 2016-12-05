
public class AppareilInterrupteur extends AppareilAbstrait {



	public AppareilInterrupteur(String categorie, int tension, double amperage, String emplacement) {
		super(categorie, tension, amperage, 0, emplacement);
		
	}

	@Override
	public boolean estVariateur() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPuissance() {
		return getTension()*getAmperage();
	}

	@Override
	public int getEtat() {
		
		return getPuissance()==0? Disjoncteur.ETEINT:Disjoncteur.ALLUME;
	}

}
