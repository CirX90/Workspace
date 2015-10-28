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
	 * auch keinen Eingang hat. Daf�r soll ein Wahrheitsgehalt bei Erstellung
	 * eines Konstant-Objekts miterstellt werden.
	 * 
	 * @param konstanterWert
	 */

	public Konstante(boolean konstanterWert) {
		super();
		this.konstanterWert = konstanterWert;
	}

	/**
	 * Methode aus der Superklasse mit �berschriebenem Inhalt zum Auswerten der
	 * Eing�nge.
	 */

	@Override
	public boolean auswerten() {
		return konstanterWert;
	}

	/**
	 * Methode aus der Superklasse mit �berschriebenem Inhalt zum Ausgeben der
	 * Anzahl der Eing�nge.
	 */

	@Override
	public int getAnzahlEingaenge() {
		return 0;
	}

	/**
	 * Methode aus der Superklasse mit �berschriebenem Inhalt zum Ausgeben des
	 * Gattertyps.
	 */

	@Override
	public GatterTyp getGatterTyp() {
		return GatterTyp.KONSTANTE;
	}

}