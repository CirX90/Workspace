package aufgabenblatt6_2;

/**
 * Dieses Programm dient dazu konstante Wahrheitsgehalte darzustellen.
 * @author Tom Hertel
 *
 */

public class Konstante extends LogikGatter {
	
	/**
	 * Variable mit konstantem Wert, der einen Wahrheitsgehalt darstellt.
	 */

	private final boolean konstanterWert;

	/**
	 * Aufrufen des default-Superkonstruktors mit keinem Parameter da Konstante
	 * auch keinen Eingang hat. Dafür soll ein Wahrheitsgehalt bei Erstellung
	 * eines Konstant-Objekts miterstellt werden.
	 * 
	 * @param konstanterWert
	 */

	public Konstante(boolean konstanterWert) {
		super();
		this.konstanterWert = konstanterWert;
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Auswerten der
	 * Eingänge.
	 */

	@Override
	public boolean auswerten() {
		return konstanterWert;
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben der
	 * Anzahl der Eingänge.
	 */

	@Override
	public int getAnzahlEingaenge() {
		return 0;
	}

	/**
	 * Methode aus der Superklasse mit überschriebenem Inhalt zum Ausgeben des
	 * Gattertyps.
	 */

	@Override
	public GatterTyp getGatterTyp() {
		return GatterTyp.KONSTANTE;
	}

}