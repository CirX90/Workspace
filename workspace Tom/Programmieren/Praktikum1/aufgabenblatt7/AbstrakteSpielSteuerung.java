package aufgabenblatt7;

/**
 * Diese Interface stellt die Steuerung des Spiels bereit.
 * 
 * @author Philipp Jenke
 *
 */
public abstract class AbstrakteSpielSteuerung {

	/**
	 * Hier wird das aktuelle Spielfeld (automatisch) zwischengespeichert.
	 */
	protected AbstraktesSpielfeld spielfeld;

	/**
	 * Setter. Wird durch das Spiel automatisch gesetzt. Nicht nochmal aufrufen!
	 * 
	 * @param spielfeld
	 *            Neues Spielfeld-Objekt.
	 */
	public void setSpielfeld(AbstraktesSpielfeld spielfeld) {
		this.spielfeld = spielfeld;
	}

	/**
	 * Getter.
	 * 
	 * @return Liefert den Zugriff auf das aktuelle Spielfeld.
	 */
	public AbstraktesSpielfeld getSpielfeld() {
		return spielfeld;
	}

	// *** DIE FOLGENDEN METHODEN MÜSSEN SIE IN ABGELEITETEN KLASSEN
	// IMPLEMENTIEREN! ***

	/**
	 * Diese Methode wird immer dann aufgerufen, wenn ein weiterer Spielzug
	 * stattfindet. Als Parameter bekommt Sie das Kommando, das verarbeitet
	 * werden soll.
	 * 
	 * @param kommando
	 *            Diese Kommando wurde in Benutzerinterface für den Spielzug
	 *            eingegeben.
	 */
	public abstract void spielzug(String kommando);
}
