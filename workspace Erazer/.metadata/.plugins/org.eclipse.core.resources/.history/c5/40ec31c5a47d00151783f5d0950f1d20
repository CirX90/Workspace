package aufgabenblatt7;

/**
 * In dieser Klasse findet die Initialisierung des Spiels statt.
 * 
 * @author Philipp Jenke
 *
 */
public class SpielInitialisierung {

	/**
	 * Spielfeld-Obejekt erzeugt.
	 */

	private Spielfeld spielfeld = new Spielfeld();

	/**
	 * Spielsteuerungs-Obejekt erzeugt.
	 */

	private SpielSteuerung spielSteuerung = new SpielSteuerung();

	/**
	 * Hier muss ein ISpielfeld-Objekt erzeugt werden. Das muss die Assets
	 * enthalten.
	 * 
	 * @return ISpielfeld-Objekt.
	 */

	public AbstraktesSpielfeld getSpielfeld() {
		return spielfeld;
	}

	/**
	 * Getter.
	 * 
	 * @return In dieser Methode muss das Spielsteuerungsmodul zurückgeliefert
	 *         werden.
	 */

	public AbstrakteSpielSteuerung getSpielSteuerung() {
		return spielSteuerung;
	}

	/**
	 * Liefert den Pfad und Dateinamen des Bildes zum gegebenen AssetTyp.
	 * 
	 * @param assetTyp
	 *            AssetTyp, für das der Bild-Pfad geliefert werden soll.
	 * 
	 * @return Dateiname mit (relativem) Pfad.
	 */

	public String getAssetDateiname(AbstraktesAsset.AssetTyp assetTyp) {
		switch (assetTyp) {
		case HELD:
			return "held.png";
		case BOESEWICHT:
			return "boesewicht.png";
		case BAUM:
			return "baum.png";
		case WAND:
			return "wand.png";
		case LOCH:
			return "loch.png";
		case HAUS:
			return "haus.png";
		default:
			System.out.println("Unbekannter AssetTyp: " + assetTyp);
		}
		return null;
	}
}