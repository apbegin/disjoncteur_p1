import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanneauPrincipal extends JPanel{

	private Boite boite;
	private PanneauInfoBoite panInfoBoite;
	private PanneauDisjoncteurs panDisjoncteur;
	
	
	public PanneauPrincipal(Boite b) {
		this.boite = b;
		
		this.panInfoBoite = new PanneauInfoBoite(b);
		this.panDisjoncteur = new PanneauDisjoncteurs(b);
		this.add(panInfoBoite);
		this.add(panDisjoncteur);
		
	}
	
}
