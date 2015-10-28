/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt4_2;

public class Wagen {

	// Variablen
	private final int wagenKapazitaet;
	private final int wagenLaenge;
	private final int wagenSeriennummer;

	private Wagen naechsterWagen;

	// Konstruktor zur Erstellung eines Wagens
	// mit Parametern Länge, Kapazität und Seriennummer.
	public Wagen(int kapazitaet, int laenge, int seriennummer) {
		this.wagenLaenge = laenge;
		this.wagenKapazitaet = kapazitaet;
		this.wagenSeriennummer = seriennummer;
	}

	// Getter und Setter Methoden
	public int getLaenge() {
		return wagenLaenge;
	}

	public int getKapazitaet() {
		return wagenKapazitaet;
	}

	public int getWagenSeriennummer() {
		return wagenSeriennummer;
	}

	public Wagen getNaechsterWagen() {
		return naechsterWagen;
	}

	public void setNaechsterWagen(Wagen naechsterWagen) {
		this.naechsterWagen = naechsterWagen;
	}

}