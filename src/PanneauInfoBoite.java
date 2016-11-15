import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauInfoBoite extends JPanel {
	
	private Boite boite;
	
	public PanneauInfoBoite(Boite b) {
		this.boite = b;
		JLabel etiqUps = new JLabel("UPS" + String.valueOf(boite.getMaxAmperes()));
		this.add(etiqUps);
	}

}
