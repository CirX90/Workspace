package aufgabenblatt6_2;

/**
 * Dieses Programm beschreibt das logische Und. Dieses hat den Wahrheitsgehalt
 * wahr nur wenn beide Eingänge ebenfalls wahr sind.
 * 
 * @author Tom Hertel
 *
 */

public class Und extends LogikGatter {

	/**
	 * Konstruktor für Und mit zwei Eingängen.
	 * 
	 * @param eingang1
	 * @param eingang2
	 */

	public Und(LogikGatter eingang1, LogikGatter eingang2) {
		super(eingang1, eingang2);
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Auswerten der
	 * Eingänge.
	 */

	@Override
	public boolean auswerten() {
		if (eingang1 == null || eingang2 == null) {
			throw new IllegalArgumentException("Keinen Inhalt entdeckt.");
		}
		return eingang1.auswerten() && eingang2.auswerten();
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben der
	 * Anzahl der Eingänge.
	 */

	@Override
	public int getAnzahlEingaenge() {
		return 2;
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben des
	 * Gattertyps.
	 */

	@Override
	public GatterTyp getGatterTyp() {
		return GatterTyp.UND;
	}

}