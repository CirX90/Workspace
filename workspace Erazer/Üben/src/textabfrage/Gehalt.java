package textabfrage;

import javax.swing.JOptionPane;

public class Gehalt {
	public static void main(String [] args) {
		
		double gehalt = 0.0;
		String eingabeGehalt = "";
		
		eingabeGehalt = JOptionPane
				.showInputDialog("Bitte geben Sie Ihr Monatsgehalt ein:");
		
		gehalt = Double.parseDouble(eingabeGehalt);
		
		if (gehalt < 1000) {
			JOptionPane.showMessageDialog(null, gehalt * 0.02 + "€");
		} 
		else if  (gehalt < 2000) {
			JOptionPane.showMessageDialog(null, gehalt * 0.05 + "€");
		}
		else if (gehalt < 5000) {
			JOptionPane.showMessageDialog(null, gehalt * 0.1 + "€");
		}
		else if (gehalt < 10000) {
			JOptionPane.showMessageDialog(null, gehalt * 0.25 + "€");
		} else {
			JOptionPane.showMessageDialog(null, gehalt * 0.5 + "€");
		}
	}
}