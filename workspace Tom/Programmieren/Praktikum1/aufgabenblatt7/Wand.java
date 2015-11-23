package aufgabenblatt7;

/**
 * Stellt ein Objekt auf dem Spielfeld dar.
 * 
 * @author Tom Hertel
 */

public class Wand extends AbstraktesAsset {

	/**
	 * Liefert den Typ des Assets.
	 * 
	 * @return AssetTyp.WAND.
	 */

	@Override
	public AssetTyp getTyp() {
		return AssetTyp.WAND;
	}

}