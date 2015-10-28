/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 6, Aufgabe 2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt6_2;

/**
 * Dieses Programm dient dazu ein Logikgatter darzustellen, also ein System von
 * logischen Schaltungen zur Realisierung von Boolschen Funktionen.
 * 
 * @author Tom Hertel
 *
 */

public abstract class LogikGatter {

	/**
	 * Gesch�tzte Objektvariable die einen Eingang darstellen soll.
	 */

	protected LogikGatter eingang1;

	/**
	 * Gesch�tzte Objektvariable die einen Eingang darstellen soll.
	 */

	protected LogikGatter eingang2;

	/**
	 * Gesch�tzte Objektvariable die einen Typ das Gatters darstellen soll.
	 */

	protected GatterTyp typ;

	/**
	 *
	 */

	public enum GatterTyp {
		UND, ODER, NEGATION, KONSTANTE
	}

	/**
	 * Konstruktor der keinen Eingang darstellt.
	 */

	public LogikGatter() {

	}

	/**
	 * Konstruktor der einen Eingang darstellt.
	 * 
	 * @param eingang1
	 */

	public LogikGatter(LogikGatter eingang1) {
		this.eingang1 = eingang1;

	}

	/**
	 * Konstruktor der zwei Eing�nge darstellt.
	 * 
	 * @param eingang1
	 * @param eingang2
	 */

	public LogikGatter(LogikGatter eingang1, LogikGatter eingang2) {
		this.eingang1 = eingang1;
		this.eingang2 = eingang2;

	}

	/**
	 * Abstrakte Methode, die weitervererbt werden soll, um den Wahrheitsgehalt
	 * auswerten zu k�nnen.
	 */

	public abstract boolean auswerten();

	/**
	 * Abstrakte Methode, die weitervererbt werden soll, um die Anzahl der
	 * Eing�nge r�ckgeben zu k�nnen.
	 */

	public abstract int getAnzahlEingaenge();

	/**
	 * Methode, die weitervererbt werden soll, um den Typ des Gatters r�ckgeben
	 * zu k�nnen.
	 * 
	 * @return typ
	 */

	public GatterTyp getGatterTyp() {
		return typ;

	}

}