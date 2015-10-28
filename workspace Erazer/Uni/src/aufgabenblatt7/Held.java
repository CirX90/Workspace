package aufgabenblatt7;

/**
 * Stellt ein Objekt auf dem Spielfeld dar.
 * 
 * @author Tom Hertel
 */

public class Held extends AbstraktesAsset {

	/**
	 * Liefert den Typ des Assets.
	 * 
	 * @return AssetTyp.HELD.
	 */

	@Override
	public AssetTyp getTyp() {
		return AssetTyp.HELD;
	}

}