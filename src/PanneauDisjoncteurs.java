import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.InitialContextFactoryBuilder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanneauDisjoncteurs extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boite boite;
	
	public PanneauDisjoncteurs(Boite b, PanneauInfoBoite infoBoite) {
		
		removeAll();
		this.boite = b;
		
		GridLayout layout = new GridLayout(Boite.NB_LIGNES_MAX, Boite.NB_COLONNES,175,0);
		
		this.setLayout(layout);
		
		for(int i = 0; i < Boite.NB_LIGNES_MAX; i++){
			for(int j = 0; j < Boite.NB_COLONNES; j++){
				this.add(new DisjoncteurGui(boite.getDisjoncteur(j, i)));
			}
			
		}
		
		infoBoite.validate();
		infoBoite.repaint();
		
	}
	
	private class InterrupteurGui extends JPanel{
		
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InterrupteurGui(int etat) {
		
			JButton btnGauche = new JButton();
			JButton btnDroit = new JButton();
			GridLayout layout = new GridLayout(1, 2);
			setLayout(layout);
			
			if(etat == Disjoncteur.ETEINT){
				
				btnGauche.setBackground(Color.RED);
				btnDroit.setBackground(Color.BLACK);
				
			}
			else{
				btnGauche.setBackground(Color.BLACK);
				
				btnDroit.setBackground(Color.WHITE);
				
			}
			
			add(btnDroit);
			add(btnGauche);
		
		}
	}
	
	private class DisjoncteurGui extends JPanel{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public DisjoncteurGui(Disjoncteur d) {
		
			JButton btnGauche = new JButton();
			JButton btnDroit = new JButton();
			GridLayout layout;
		
			layout = new GridLayout(1, 2);
			setLayout(layout);
			
			if(d == null){
				btnGauche.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(((JButton)e.getSource())== btnGauche){
							UtilitaireGestionMenu.ajouterDisjoncteur(boite);
							btnGauche.validate();
							btnGauche.repaint();
							
							
						}
					}
				});
				
				add(btnGauche);
				btnDroit.setBackground(Color.GRAY);
				add(btnDroit);
			}
			else{
				
				btnGauche.setText(d.toString());
				btnGauche.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(((JButton)e.getSource())== btnGauche){
							AppareilAbstrait appareil = FenetreSaisieAppareil.getAppareil();
							if(appareil != null){
								if(appareil.getTension() == d.getTension()){
									btnGauche.validate();
									btnGauche.repaint();
								}
								else{
									JOptionPane.showMessageDialog(null, "Les tensions doivent êtres égales");
								}
							}
						}
						
					}
				});
				add(btnGauche);
				add(new InterrupteurGui(0));	
			}
					
			
			
		}
		
	}
}
