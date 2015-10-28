/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 1
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt4_1;

import java.util.Scanner;

public class Tamagotchi {

	// Deklarieren der Startwerte, Scanner erstellen.
	private int hunger;
	private int langeweile;
	private int muedigkeit;
	private int punkte;

	private Scanner scanner = new Scanner(System.in);

	/**
	 *  Konstruktor zur Erstellung eines Tamagotchis.
	 * @param hunger
	 * @param langeweile
	 * @param muedigkeit
	 * @param punkte
	 */
	public Tamagotchi(int hunger, int langeweile, int muedigkeit, int punkte) {

		this.hunger = hunger;
		this.langeweile = langeweile;
		this.muedigkeit = muedigkeit;
		this.punkte = punkte;
	}

	// Methoden
	
	// Werte jede Runde um +1 erhöhen.
	public void tick() {

		hunger++;
		langeweile++;
		muedigkeit++;

	}

	// Durch Methoden einzelne Zustandswerte verändern.
	public void schlaf() {

		muedigkeit = 0;
		hunger++;
		langeweile = 0;
	}

	public void spiel() {

		langeweile = 0;
		hunger++;
		muedigkeit++;
	}

	public void iss() {

		hunger = 0;
		langeweile++;

	}

	// Überspringt praktisch eine Runde.
	public void nichts() {

	}

	// statische Methode beendet das Programm.
	public void ende() {

		scanner.close();
		System.out.println("Schade! Bis zum nächsten Mal!");
		System.exit(0);

	}

	// Spiel wird mit -Punkten verloren.
	public void verlieren(int punkte) {

		if (punkte < 0) {
			System.out.println("\nLeider hast du das Spiel verloren!\n");
			ende();
		}

	}

	// Stringeingabe über Scanner für die Tamagotchi-kommandos.
	// Rückgabe Kommandos.
	public String getNextKommando() {

		System.out.println("Bitte gib einen Befehl ein!");
		String kommando = scanner.next();
		return kommando;

	}

	// Strings werden verglichen und entsprechende Methode ausgeführt.
	public void verarbeiteKommando(String kommando) {

		while (true) {

			if (kommando.equals("iss")) {
				iss();
				break;
			} else if (kommando.equals("schlaf")) {
				schlaf();
				break;
			} else if (kommando.equals("spiel")) {
				spiel();
				break;
			} else if (kommando.equals("nichts")) {
				nichts();
				break;
			} else if (kommando.equals("ende")) {
				ende();
				break;
			} else {
				System.out.println("\nIch habe deinen Befehl leider "
						+ "nicht verstanden. \nBitte wiederhole den Befehl! \n"
						+ "Deine Möglichkeiten sind iss, schlaf, spiel, nichts"
						+ " oder ende.");

				kommando = scanner.next();

				continue;

			}

		}

	}

	// Getter für Punkte und Rückgabe dieser.
	public int getPunktestand() {
		punkte = hunger >= 4 ? punkte - 2 : punkte + 1;
		punkte = muedigkeit >= 4 ? punkte - 2 : punkte + 1;
		punkte = langeweile >= 4 ? punkte - 2 : punkte + 1;
		return punkte;
	}

	// Verarbeitung des Punktestandes und weitere Rückgabe für die
	// Methode verlieren.
	public int printPunktestand(int punkte) {

		System.out.println("Aktueller Hungerzustand: " + hunger + "\n"
				+ "Aktueller Langeweilezustand: " + langeweile + "\n"
				+ "Aktueller Müdigkeitszustand: " + muedigkeit + "\n"
				+ "Aktueller Punktestand: " + punkte);

		if (hunger >= 4) {
			System.out.println("Mir geht es nicht gut! Ich bin hungrig!");
		} else if (langeweile >= 4) {
			System.out.println("Mir geht es nicht gut! Mir ist langweilig!");
		} else if (muedigkeit >= 4) {
			System.out.println("Mir geht es nicht gut! Ich bin müde!");
		} else {
			System.out.println("Mir geht es sehr gut. Ich danke dir!");
		}

		return punkte;
	}

	// Main-Methode, Tamagotchis werden erstellt.
	// Zustände beginnen bei - damit das Spiel mit 0 Punkten startet.
	// Game-Loop.
	public static void main(String[] args) {

		Tamagotchi tamagotchi1 = new Tamagotchi(-1, -1, -1, -3);

		System.out.println("Hallo ich bin ein Tamagotchi. \nDu kannst "
				+ "mir Befehle geben, "
				+ "wenn du willst, dass es mir gut geht. \n"
				+ "Diese lauten: iss, spiel, schlaf oder nichts. \n"
				+ "Mit ende beendest du dieses Spiel.\n");

	// Endlosschleife bis man verliert oder Methode ende aufruft.
		while (true) {
			tamagotchi1.tick();
			tamagotchi1.verlieren(tamagotchi1.printPunktestand(tamagotchi1
					.getPunktestand()));
			tamagotchi1.verarbeiteKommando(tamagotchi1.getNextKommando());
			System.out.println();

			//
			
		}

	}

}