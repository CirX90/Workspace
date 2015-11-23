/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt4_2;

public class Zug {

	private Lokomotive lok;

	// Konstruktor zur Erstellung eines Zugs
	// mit Parameter einer Lok
	public Zug(Lokomotive lok) {
		this.lok = lok;
	}

	// Fügt einen Wagen in diesen Zug ein und macht diesen zum neuen ersten
	// Wagen und schiebt den vorherigen ersten weiter als naechsten Wagen.
	public void wagenHinzufuegen(Wagen neuWagen) {
		neuWagen.setNaechsterWagen(lok.getErsterWagen());
		lok.setErsterWagen(neuWagen);
	}

	// Hängt den ersten Wagen aus diesem Zug aus und liefert ihn zurück.
	// Variable erster Wagen wird mit Wert von lok.ErsterWagen gefüllt
	// Falls erster Wagen einen Wert besitzt wird der nächste Wagen zum
	// lok.ErsterWagen gemacht und dann zurückgegeben.
	public Wagen erstenWagenEntfernen() {
		Wagen ersterWagen = lok.getErsterWagen();
		if (ersterWagen != null) {
			lok.setErsterWagen(ersterWagen.getNaechsterWagen());
			ersterWagen.setNaechsterWagen(null);
		}
		return ersterWagen;
	}

	// Hängt alle Wagen des "anderen Zuges" in diesen Zug ein.
	// Durch Rückgabe aus Entfernen-Methode, wird dieser Wagen
	// hier eingefügt solange bis erster Wagen Wert null hat.
	// Mit this kann man praktisch nicht vom gleichen Zug die
	// Wagen an den selben, sondern nur an andere Züge hängen.
	public void zugAnhaengen(Zug andererZug) {
		if (this != andererZug) {
			while (andererZug.lok.getErsterWagen() != null) {
				wagenHinzufuegen(andererZug.erstenWagenEntfernen());
			}
		}
	}

	// Anzahl an erstellten Wagen wird zurückgegeben.
	// Bis Wagen wert null erreicht.
	public int getWagenAnzahl() {
		int anzahl = 0;
		Wagen wagen = lok.getErsterWagen();

		while (wagen != null) {
			anzahl++;
			wagen = wagen.getNaechsterWagen();
		}
		return anzahl;
	}

	// Passagierkapazitaet der einzelnen Wagen wird addiert und zurückgegeben.
	// Bis erster Wagen den Wert null erreicht.
	public int getKapazitaet() {
		int kapazitaet = 0;
		Wagen wagen = lok.getErsterWagen();

		while (wagen != null) {
			kapazitaet += wagen.getKapazitaet();
			wagen = wagen.getNaechsterWagen();
		}
		return kapazitaet;
	}

	// Länge von Lok und allen Wagen addiert und zurückgegeben.
	public int getLaenge() {
		int laenge = lok.getLokLaenge();
		Wagen wagen = lok.getErsterWagen();

		// Schleife bricht ab wenn der Wagen mit dem Inhalt null erreicht wird
		// und das trifft auf den letzten Wagen zu.
		while (wagen != null) {
			laenge += wagen.getLaenge();
			wagen = wagen.getNaechsterWagen();
		}

		return laenge;
	}

	// Gibt die Einzelheiten dieses Zuges auf der Konsole aus solange
	// bis erster Wagen den Wert null erreicht.
	public void info() {
		System.out.format("Lokomotive: Typ = %d, Länge = %dm%n",
				lok.getLokTyp(), lok.getLokLaenge());
		int nummer = 1;
		Wagen wagen = lok.getErsterWagen();
		while (wagen != null) {
			System.out.format(
					"Wagen #%d: Passagierkapazität = %d, Länge = %dm,"
							+ " Seriennummer = %d%n", nummer,
					wagen.getKapazitaet(), wagen.getLaenge(),
					wagen.getWagenSeriennummer());
			wagen = wagen.getNaechsterWagen();
			nummer++;
		}

	}

}