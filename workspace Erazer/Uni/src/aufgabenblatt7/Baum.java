package aufgabenblatt7;

/**
 * Stellt ein Objekt auf dem Spielfeld dar.
 * 
 * @author Tom Hertel
 */

public class Baum extends AbstraktesAsset {

	/**
	 * Liefert den Typ des Assets.
	 * 
	 * @return AssetTyp.BAUM.
	 */

	@Override
	public AssetTyp getTyp() {
		return AssetTyp.BAUM;
	}

}