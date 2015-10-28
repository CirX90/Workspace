/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 * Verwendete Quellen: Buch (Grundkurs Java), Vorlesungsfolien
 */

package aufgabenblatt3_2;

import java.util.Scanner;

public class Nadelbaum {
	public static void main(String[] args) {

		// Eingabe Höhes des "Baumes"
		Scanner scanner = new Scanner(System.in);
		System.out.println("Höhe des Nadelbaums eingeben.");
		int hoehe = scanner.nextInt();
		scanner.close();

		int zeilen;
		int spalten;

		// "Krone" des Baumes zeichnen, Abbruchbedingung
		for (zeilen = 1; zeilen <= hoehe; zeilen++) {

			// Punkte links vom Baum zeichnen
			for (spalten = 1; spalten <= hoehe - zeilen; spalten++){
				System.out.print(".");
			}

			// Nur ungerade Zahlen auswerten um Baum-Form zu erhalten
			for (spalten = 1; spalten <= (2 * zeilen - 1); spalten++){
				System.out.print("*");
			}

			// Gleiche Anzahl an Punkten auch rechts vom Baum
			for (spalten = 1; spalten <= hoehe - zeilen; spalten++){
				System.out.print(".");
			}

			// Zeilenumbruch
			System.out.println("");
		}
	}
}