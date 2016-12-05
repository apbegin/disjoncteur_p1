import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauInfoBoite extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boite boite;
	
	public PanneauInfoBoite(Boite b) {
		this.boite = b;
		
		JPanel tempo = new JPanel();
		
		tempo.setLayout(new BoxLayout(tempo, BoxLayout.Y_AXIS));
		
		JLabel etiqUps = new JLabel("UPS: "+ String.valueOf(boite.getMaxAmperes()));
		
		
		JLabel etiqConsommation = new JLabel("Consommation: " 
				+ String.valueOf(boite.getConsommationTotalEnWatt()));
		
	
		JLabel etiqNbDisjoncteur = new JLabel("Nombre de disjoncteurs: " 
				+ String.valueOf(boite.getNbDisjoncteurs()));
		
		JLabel etiqNbDisjEntree = new JLabel("Nombre de disjoncteurs entrée: " 
				+ String.valueOf(boite.getNbDisjoncteursEntree()));
		
		JLabel etiqNbDisjPhase = new JLabel("Nombre de disjoncteurs phase: " 
				+ String.valueOf(boite.getNbDisjoncteursPhase()));
				
		tempo.add(etiqUps);
		tempo.add(etiqConsommation);
		tempo.add(etiqNbDisjoncteur);
		tempo.add(etiqNbDisjEntree);
		tempo.add(etiqNbDisjPhase);
		
		this.setAlignmentX(TOP_ALIGNMENT);
		
		this.add(tempo);
	}

}
