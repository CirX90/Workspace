/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2
 * Verwendete Quellen: Wikipedia (Begriff: BMI), Vorlesungsfolien
 */

package aufgabenblatt2_2;

import java.util.*;

public class BMIndex {

	public static void main(String[] args) {
		double groesse;
		double gewicht;
		int    bmi;

		// Benutzereingaben entgegennehmen
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Bitte erst Größe in m und dann Gewicht in kg angeben.");
		groesse = scanner.nextDouble();
		gewicht = scanner.nextDouble();
		scanner.close();
		
		bmi = (int) (gewicht / (groesse * groesse));
		
		System.out.println(bmi);
	}
}