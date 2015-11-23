/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt4_2;

public class Lokomotive {

	// Variablen
	private final int lokLaenge;
	private final int lokTyp;
	private Wagen ersterWagen;

	// Konstruktor zur Erstellung einer Lokomotive
	// mit Parametern Länge und Typ.
	public Lokomotive(int laenge, int typ) {
		this.lokLaenge = laenge;
		this.lokTyp = typ;
	}

	// Getter und Setter Methoden
	public int getLokLaenge() {
		return lokLaenge;
	}

	public int getLokTyp() {
		return lokTyp;
	}

	public Wagen getErsterWagen() {
		return ersterWagen;
	}

	public void setErsterWagen(Wagen ersterWagen) {
		this.ersterWagen = ersterWagen;
	}

}