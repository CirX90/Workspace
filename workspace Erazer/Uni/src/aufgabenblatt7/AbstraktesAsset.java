package aufgabenblatt7;

/**
 * Alle Objekte im Spiel erweitern diese abstrakte Klasse.
 * 
 * @author Philipp Jenke
 */
public abstract class AbstraktesAsset {

	/**
	 * Dies sind die im Spiel unterstützen Asset-Typen.
	 * 
	 * @author Philipp Jenke
	 */
	public static enum AssetTyp {
		HELD, BOESEWICHT, WAND, BAUM, LOCH, HAUS
	}

	/**
	 * Statischer Objektzäler zum Erzeugen eindeutiger IDs (der Startwert ist
	 * egal).
	 */
	private static int assetZaehler = 23;

	/**
	 * Eindeutige id des Assets;
	 */
	private final int id;

	/**
	 * Konstruktor. Setzt die eindeutige Id.
	 */
	public AbstraktesAsset() {
		id = assetZaehler;
		assetZaehler++;
	}

	/**
	 * Getter.
	 * 
	 * @return Liefert die eindeutige Id des Assets.
	 */
	public int getId() {
		return id;
	}

	// *** DIE FOLGENDEN METHODEN MÜSSEN SIE IN ABGELEITETEN KLASSEN
	// IMPLEMENTIEREN! ***

	/**
	 * Liefert den Typ des Assets.
	 * 
	 * @return Typ.
	 */
	public abstract AssetTyp getTyp();

}