import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanneauPrincipal extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanneauInfoBoite panInfoBoite;
	private PanneauDisjoncteurs panDisjoncteur;
	
	
	public PanneauPrincipal(Boite b) {
		
		BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(boxLayout);
		this.panInfoBoite = new PanneauInfoBoite(b);
		
		
		this.panDisjoncteur = new PanneauDisjoncteurs(b, panInfoBoite);
		this.add(panInfoBoite);
		this.add(panDisjoncteur);
		
	}
	
}
