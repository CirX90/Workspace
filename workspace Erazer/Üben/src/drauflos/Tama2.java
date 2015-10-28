/**
 * Praktikum Programmiermethodik, SS 2015
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 */

package drauflos;

/**
 * Scanner importieren
 */
import java.util.Scanner;

public class Tama2 {

	/**
	 * Scanner erstellen
	 */
	Scanner scan = new Scanner(System.in);

	/**
	 * Variable hunger initialisieren
	 */
	private int hunger = 0;

	/**
	 * Variable langeweile initialisieren
	 */
	private int langeweile = 0;

	/**
	 * Variable muedigkeit initialisieren
	 */
	private int muedigkeit = 0;

	/**
	 * Variable punkte initialisieren
	 */
	private int punkte = 0;

	/**
	 * Methode tick erhöht hunger, langweile und muedigkeit um 1
	 */
	public void tick() {
		hunger++;
		langeweile++;
		muedigkeit++;
	}

	/**
	 * Methode iss erhöht langeweile um 1 und setzt hunger auf 0
	 */
	public void iss() {
		hunger = 0;
		langeweile++;
	}

	/**
	 * Methode schlaf langeweile und muedigkeit werden auf 0 gesetzt hunger wird
	 * um 1 erhöht
	 */
	public void schlaf() {
		langeweile = 0;
		muedigkeit = 0;
		hunger++;
	}

	/**
	 * Methode spiel setzt langeweile auf 0 und erhöht muedigkeit und hunger um
	 * 1
	 */
	public void spiel() {
		langeweile = 0;
		muedigkeit++;
		hunger++;
	}

	/**
	 * Methode nichts ist eine leere Methode
	 */
	public void nichts() {

	}

	/**
	 * Methode ende schließt Scanner und beendet Programm
	 */
	public void ende() {
		scan.close();
		System.out.println("Bis zum nächsten Mal! :)");
		System.exit(0);
	}

	/**
	 * Methode printPunktestand berechnet den Punktestand für die drei
	 * Statuswerte Textausgabe zur Beurteilung des Zustandes
	 */
	private void printPunktestand(int punkte) {
		System.out.println("Aktueller Hungerzustand: " + hunger + "\n"
				+ "Aktueller Langeweilezustand: " + langeweile + "\n"
				+ "Aktueller Müdigkeitszustand: " + muedigkeit + "\n"
				+ "Aktueller Punktestand: " + punkte);
		if (hunger >= 4 || langeweile >= 4 || muedigkeit >= 4) {
			System.out.println("Mir geht es nicht gut! :(");
		} else {
			System.out.println("Mir geht es gut! :)");
		}
	}

	/**
	 * Eingegeben Befehl auswerten und Methode ausführen Vergleicht Strings mit
	 * eingegebenem String wert kommando
	 */
	private void verarbeiteKommando(String kommando) {
		if (kommando.equals("iss")) {
			iss();
		} else if (kommando.equals("schlaf")) {
			schlaf();
		} else if (kommando.equals("spiel")) {
			spiel();
		} else if (kommando.equals("nichts")) {
			nichts();
		} else {
			ende();
		}
	}

	/**
	 * Getter
	 */
	public int getPunktestand() {
		punkte = hunger >= 4 ? punkte - 2 : punkte + 1;
		punkte = langeweile >= 4 ? punkte - 2 : punkte + 1;
		punkte = muedigkeit >= 4 ? punkte - 2 : punkte + 1;
		return punkte;
	}

	/**
	 * Befehl einlesen
	 * 
	 */
	private String getNextKommando() {
		System.out.println("Gebe einen Befehl an, den ich ausführen soll! :)");
		String eingabe = scan.nextLine();
		return eingabe;
	}

	/**
	 * Main Methode
	 */
	public static void main(String[] args) {

		/**
		 * neuer Tamagochi wird erzeugt
		 */
		Tama2 tamagochi = new Tama2();
		System.out
				.println("Hallo ich bin ein Tamagochi :)\nDu kannst mir Befehle geben, wenn du willst :)\n");
		/**
		 * While-Schleife als Game-loop
		 */
		while (true) {
			tamagochi.tick();
			tamagochi.printPunktestand(tamagochi.getPunktestand());
			tamagochi.verarbeiteKommando(tamagochi.getNextKommando());
			System.out.println();
		}

	}
}