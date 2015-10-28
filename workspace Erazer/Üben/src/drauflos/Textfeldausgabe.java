package drauflos;

import javax.swing.*;

public class Textfeldausgabe {
	public static void main(String[] args) {
		
	String nameEingabe = JOptionPane.showInputDialog("Bitte gib eine Zahl ein.");
	int eingabe = Integer.parseInt(nameEingabe);
	JOptionPane.showMessageDialog(null, eingabe);
	
	}
}