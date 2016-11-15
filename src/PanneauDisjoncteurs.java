import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauDisjoncteurs extends JPanel{

	private Boite boite;
	
	public PanneauDisjoncteurs(Boite b) {
		
		this.boite = b;
		
		GridLayout layout = new GridLayout(b.NB_LIGNES_MAX, b.NB_COLONNES);
		layout.addLayoutComponent("test", new JButton());
		this.setLayout(layout);

		for(int i = 0; i < b.NB_LIGNES_MAX; i++){
			for(int j = 0; j < b.NB_COLONNES; j++){
				this.add(new DisjoncteurGui(boite.getDisjoncteur(j, i)));
			}
		}
		
		
	}
	
	private class InterrupteurGui extends JPanel{
		
		
		public InterrupteurGui(int etat) {
		
			JButton btnGauche = new JButton();
			JButton btnDroit = new JButton();

			
			
			if(etat == Disjoncteur.ETEINT){
				btnGauche.setBackground(Constantes.COULEUR_FOND.RED);
				btnDroit.setBackground(Constantes.COULEUR_FOND.BLACK);
				
			}
			else{
				btnGauche.setBackground(Constantes.COULEUR_FOND.BLACK);
				btnDroit.setBackground(Constantes.COULEUR_FOND.WHITE);
			}
			
	
			btnGauche.add(btnDroit);
			add(btnGauche);
		}
	}
	
	private class DisjoncteurGui extends JPanel{
		
		public DisjoncteurGui(Disjoncteur d) {
		
			JButton btnGauche = new JButton();
			JButton btnDroit = new JButton();
			
			
			if(d == null){
				btnDroit.setBackground(Constantes.COULEUR_FOND.GRAY);
				
				
			}
			else{
				
				btnGauche.setText(d.toString());
				new InterrupteurGui(d.getEtat());		
				
			}
			
			add(btnGauche);
			add(btnDroit);
			
		}
		
	}
}
