/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 3
 * Verwendete Quellen: Wikipedia (Begriff: Primfaktorzerlegung), Vorlesungsfolien
 */

package aufgabenblatt3_3;

import java.util.Scanner;


public class Primfaktoren {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Geben Sie eine positive ganze natürliche Zahl ein: ");
		int zahl = scan.nextInt();
		scan.close();

		// weil Eingabe >= 2 sein soll
		int teiler = 2;

		System.out.print("Die Primfaktoren von " + zahl + " sind: ");

		// Primfaktoren werden bestimmt und einzeln auf der Konsole ausgegeben
		// Abbruchbedingung while
		while (teiler <= zahl) {
			// Ergebnis ganzzahlig teilbar
			if (zahl % teiler == 0) {
				System.out.print(teiler + " ");
				zahl /= teiler;
			} else {
				teiler++;
			}

		}
	}
}
