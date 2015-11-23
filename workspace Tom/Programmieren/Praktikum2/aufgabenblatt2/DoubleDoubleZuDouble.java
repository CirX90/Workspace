/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 2.1
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt2;

/**
 * Funktionales Interface. Die Methode soll zwei Doubles als Argumente
 * akzeptieren und als Ergebnis einen Double-Wert zurückliefern.
 * 
 * @author Tom Hertel
 */

@FunctionalInterface
public interface DoubleDoubleZuDouble {

	public double werteAus(double zahl1, double zahl2);

}
