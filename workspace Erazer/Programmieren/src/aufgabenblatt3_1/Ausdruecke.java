/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 1
 * Verwendete Quellen: Wikipedia (Begriff: Flächeninhalt, Umfang), Vorlesungsfolien
 */

package aufgabenblatt3_1;

public class Ausdruecke {
	public static void main(String[] args) {

		// A
		// mathematische Formel Pi(3,1415926...) anwenden, Aussagen vergleichen
		double radius = 0.1;
		double umfang = 2 * Math.PI * radius;
		double seitenlaenge = 0.25;
		double flaecheninhalt = seitenlaenge * seitenlaenge;
		boolean vergleich = umfang > 1.5 && flaecheninhalt < 0.5;

		System.out.println("a) Die Aussagen sind " + vergleich + ".");

		// B
		// Typkonversion für Vergleich des ganzzahligen Anteils
		boolean markiert = false;
		double eingabeZahl = 15.5;
		boolean aussage = markiert ^ (int) eingabeZahl != 15;

		System.out.println("b) Die Aussagen sind " + aussage + ".");

		// C
		// Epsilon und Math.abs um Abweichung zu berücksichtigen
		final double EPSILON = 1e-10;
		double ersteZahl = 1.5;
		double zweiteZahl = 3.2;
		boolean ergebnis = ersteZahl <= 1.5 && zweiteZahl >= 3.2
				&& Math.abs(ersteZahl - zweiteZahl) < EPSILON;

		System.out.println("c) Die Aussagen sind " + ergebnis + ".");
	}
}