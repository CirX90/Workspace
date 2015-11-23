package aufgabenblatt6_2;

/**
 * Dieses Programm beschreibt die logische Negation. Dieses hat nur den
 * Wahrheitsgehalt wahr wenn der Eingang falsch ist.
 * 
 * @author Tom Hertel
 */

public class Negation extends LogikGatter {
	
	/**
	 * Aufrufen des Super-Default-Konstruktors um keinen Eingang zu simulieren.
	 */
	
	public Negation() {
		super();
		
	}

	/**
	 * Aufrufen des Superkonstruktors mit einem Parameter da Negation auch nur
	 * einen Eingang hat.
	 * 
	 * @param eingang1
	 */

	public Negation(LogikGatter eingang1) {
		super(eingang1);
	}
	
	/**
	 * Aufrufen des Superkonstruktors um zwei Eingänge zu simulieren.
	 */
	
	public Negation(LogikGatter eingang1, LogikGatter eingang2) {
		super(eingang1, eingang2);
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Auswerten der
	 * Eingänge.
	 */

	@Override
	public boolean auswerten() {
		if (eingang1 == null || (eingang1 != null && eingang2 != null)) {
			return false;
		}
		return !eingang1.auswerten();
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben der
	 * Anzahl der Eingänge.
	 */

	@Override
	public int getAnzahlEingaenge() {
		return 1;
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben des
	 * Gattertyps.
	 */

	@Override
	public GatterTyp getGatterTyp() {
		return GatterTyp.NEGATION;
	}

}