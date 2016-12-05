
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalButtonUI;


/**
 * Représente la fenêtre d'une application qui simule
 * une boîte de disjonction dans le cadre du tp3A2015 INF111.
 *  
 * @author Pierre Bélisle (copyright A2016)
 */
public class CadreBoiteDisjonction extends JFrame implements Runnable{
	public CadreBoiteDisjonction() {
	}


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
public static  final int MAX_AMPERE_DEFAUT  = 200;

	@Override
	public void run() {
	
		try {
		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		 } catch (Exception e) {
		            e.printStackTrace();
		 }
		
		
		Boite boite = new Boite (MAX_AMPERE_DEFAUT);
		boite.remplirAlea();

	            // Un titre.
		setTitle("Boîte de disjonction intelligente");
		
		// Plein écran.
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// Quitte l'application sur X.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Utilise votre panneau principal lorsque visible.
		setContentPane(new PanneauPrincipal(boite));
				
		setVisible(true);
	}
}

