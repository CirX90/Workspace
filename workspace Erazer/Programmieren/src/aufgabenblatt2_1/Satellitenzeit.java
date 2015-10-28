/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 1
 * Verwendete Quellen: Wikipedia (Begriff: BMI), Vorlesungsfolien
 */

package aufgabenblatt2_1;

import java.util.*;

public class Satellitenzeit {
	public static void main(String[] args) {

		// Scanner initialisierung
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Sekunden angeben.");
		int eingabe = scanner.nextInt();
		scanner.close();

		// Deklaration
		int rechnung = eingabe;
		int second = rechnung % 60;
		int minute = (rechnung / 60) % 60;
		int hour = (rechnung / 60 / 60) % 24;
		int day = (rechnung / 60 / 60 / 24) % 365;

		// Ausgabe und Formatierung der Ausgabe
		System.out.format("%d Tage  %d:%d:%d\n" ,day, hour, minute, second);
		
	}

}