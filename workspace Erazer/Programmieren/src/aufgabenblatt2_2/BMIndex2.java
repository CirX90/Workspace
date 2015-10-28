/**
 * Praktikum TI-PM2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2 / 2. Lösungsvorschlag
 * Verwendete Quellen: Wikipedia (Begriff: BMI), Vorlesungsfolien
 */

package aufgabenblatt2_2;   // Mit Einzeleingabe

import java.util.*;

public class BMIndex2 {

	public static void main(String[] args) {
		 // Scanner 1 und 2 Initialisierung
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Bitte Größe in Metern angeben.");
		 double groesse = scanner.nextDouble();
		 
		 Scanner scanner2 = new Scanner(System.in);
		 System.out.println("Bitte Gewicht in Kilogramm angeben.");
		 double gewicht = scanner2.nextDouble(); 
		 
		 scanner.close();
		 scanner2.close();
		 // Rechnung
		 double bmi = gewicht / (groesse*groesse);
		 // Ausgabe
		 System.out.println((int)(bmi));
		 }
}