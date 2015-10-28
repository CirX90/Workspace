/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2_3;

public class Lotto {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		int zahl3;
		int zahl4;
		int zahl5;
		int zahl6;

		// Verschiebung des Ergebnisbereiches um +1 um auch die 49
		// als Zahl zu erhalten
		zahl1 = (int) (Math.random() * 49 + 1);
		zahl2 = (int) (Math.random() * 49 + 1);
		zahl3 = (int) (Math.random() * 49 + 1);
		zahl4 = (int) (Math.random() * 49 + 1);
		zahl5 = (int) (Math.random() * 49 + 1);
		zahl6 = (int) (Math.random() * 49 + 1);

		System.out.format(
				"Die 6 von 49 Lottozahlen lauten wie folgt: %d %d %d %d %d %d",
				zahl1, zahl2, zahl3, zahl4, zahl5, zahl6);

	}
}