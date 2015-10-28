package textabfrage;

import javax.swing.*;

public class Alter {
	public static void main(String[] args) {

		String eingabeAlter = JOptionPane
				.showInputDialog("Bitte geben Sie Ihr Alter ein:");

		int alter = Integer.parseInt(eingabeAlter);

		if (alter >= 18) {
			JOptionPane.showMessageDialog(null, "Herzlich Willkommen!");
		} else {
			JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein!");
		}
	}
}