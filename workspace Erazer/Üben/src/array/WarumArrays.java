package array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class WarumArrays {
	public static void main(String[] args) {

		// Variablen alle somit deklariert
		String eingabeAnzahl = "";
		int anzahl = 0;
		String[] namen = null;

		
		eingabeAnzahl = JOptionPane
				.showInputDialog("Wie viele Namen möchten Sie eingeben?");
		
		// Parsing String in Integer(ganze Zahl)
		anzahl = Integer.parseInt(eingabeAnzahl);

		// array erstellen, Anzahl durch Eingabe
		namen = new String[anzahl];

		for (int i = 0; i < anzahl; i++) {
			namen[i] = JOptionPane.showInputDialog(i + 1 + ". Name:");

		}
		
		JOptionPane.showMessageDialog(null, Arrays.toString(namen));
	}

}
