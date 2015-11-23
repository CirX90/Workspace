package aufgabenblatt7;

/**
 * Stellt ein Objekt auf dem Spielfeld dar.
 * 
 * @author Tom Hertel
 */

public class Haus extends AbstraktesAsset {

	/**
	 * Liefert den Typ des Assets.
	 * 
	 * @return AssetTyp.HAUS.
	 */

	@Override
	public AssetTyp getTyp() {
		return AssetTyp.HAUS;
	}

}