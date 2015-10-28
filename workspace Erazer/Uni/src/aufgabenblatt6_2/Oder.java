package aufgabenblatt6_2;

/**
 * Dieses Programm beschreibt das logische Oder. Dieses hat den Wahrheitsgehalt
 * wahr nur wenn beide Eingänge einzelnd oder gemeinsam ebenfalls wahr sind.
 * 
 * @author Tom Hertel
 *
 */

public class Oder extends LogikGatter {

	public Oder(LogikGatter eingabe1, LogikGatter eingabe2) {
		super(eingabe1, eingabe2);
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Auswerten der
	 * Eingänge.
	 */

	@Override
	public boolean auswerten() throws IllegalArgumentException {
		if (eingang1 == null || eingang2 == null) {
			throw new IllegalArgumentException("Keinen Inhalt entdeckt.");
		}
		return eingang1.auswerten() || eingang2.auswerten();
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
		return GatterTyp.ODER;
	}

}