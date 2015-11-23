package aufgabenblatt7;

import java.util.ArrayList;
import java.util.List;

/**
 * Erstellung eines Spielfeldes und Einfügen von Assets.
 * 
 * @author Tom Hertel
 */

public class Spielfeld extends AbstraktesSpielfeld {

	/**
	 * Erstellung einer Collection.
	 */

	private List<AbstraktesAsset> assetsList;

	/**
	 * Erstellung eines zweidimensionalen Arrays.
	 */

	private int[][] gitterFeld;

	/**
	 * Konstruktor initialisiert Array und Liste. Füllt das Array mit Inhalten
	 * die ein leeres Feld darstellen sollen. Erstellung einer Variable vom Typ
	 * AbstraktesAsset. Erstellung von Assets und Platzierung auf dem Feld.
	 */

	public Spielfeld() {
		assetsList = new ArrayList<AbstraktesAsset>();
		gitterFeld = new int[7][7];

		for (int[] spalte : gitterFeld) {
			for (int index = 0; spalte.length > index; index++) {
				spalte[index] = -1;
			}
		}

		AbstraktesAsset neuesObjekt;

		// Wände
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(0, 1, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(0, 2, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(0, 6, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(1, 2, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(1, 6, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(3, 4, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(3, 5, neuesObjekt.getId());
		neuesObjekt = new Wand();
		assetsList.add(neuesObjekt);
		setAssetInZelle(6, 0, neuesObjekt.getId());

		// Bäume
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(2, 0, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(2, 2, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(2, 3, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(3, 2, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(3, 3, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(4, 1, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(4, 2, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(5, 2, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(5, 3, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(5, 4, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(5, 6, neuesObjekt.getId());
		neuesObjekt = new Baum();
		assetsList.add(neuesObjekt);
		setAssetInZelle(6, 6, neuesObjekt.getId());

		// Held
		neuesObjekt = new Held();
		assetsList.add(neuesObjekt);
		setAssetInZelle(1, 0, neuesObjekt.getId());

		// Haus
		neuesObjekt = new Haus();
		assetsList.add(neuesObjekt);
		setAssetInZelle(0, 0, neuesObjekt.getId());

		// Loch
		neuesObjekt = new Loch();
		assetsList.add(neuesObjekt);
		setAssetInZelle(1, 4, neuesObjekt.getId());
		neuesObjekt = new Loch();
		assetsList.add(neuesObjekt);
		setAssetInZelle(2, 4, neuesObjekt.getId());

		// Bösewicht
		neuesObjekt = new Boesewicht();
		assetsList.add(neuesObjekt);
		setAssetInZelle(1, 3, neuesObjekt.getId());
		neuesObjekt = new Boesewicht();
		assetsList.add(neuesObjekt);
		setAssetInZelle(4, 3, neuesObjekt.getId());
		neuesObjekt = new Boesewicht();
		assetsList.add(neuesObjekt);
		setAssetInZelle(5, 1, neuesObjekt.getId());

	}

	/**
	 * Liefert die Liste der erstellten Assets.
	 * 
	 * @return assetsList
	 * 
	 */

	@Override
	public List<AbstraktesAsset> getAssetsList() {
		return assetsList;
	}

	/**
	 * Liefert die Anzahl der Felder einer Zeile im quadratischen Spielfeld.
	 * 
	 * @return gitterFeld.length
	 */

	@Override
	public int getLaenge() {
		return gitterFeld.length;
	}

	/**
	 * Liefer die Anzahl der Anzahl an Assets.
	 * 
	 * @return assetsList.size();
	 */

	@Override
	public int getAnzahlAssets() {
		return assetsList.size();
	}

	/**
	 * Getter für ein Asset.
	 * 
	 * @param id
	 *            Id des gesuchten Assets.
	 * 
	 * @return Asset mit der gegebenen Id.
	 */

	@Override
	public AbstraktesAsset getAsset(int id) {
		for (AbstraktesAsset asset : assetsList) {
			if (asset.getId() == id) {
				return asset;
			}
		}
		return null;
	}

	/**
	 * Liefert die Id des Assets in dem Feld mit den Koordinaten (x,y).
	 * 
	 * @param x
	 *            x-Koordinate
	 * @param y
	 *            y-Koordinate
	 * @return Id des Assets in der Zelle. -1, falls das Feld ungültig oder leer
	 *         ist.
	 */

	@Override
	public int getAssetInZelle(int x, int y) {
		return gitterFeld[x][y];
	}

	/**
	 * Hilfsmethode zur Steuerung: Setzt das Asset mit der Id assetId in das
	 * Feld (x,y).
	 * 
	 * @param x
	 *            x-Koordinate des Feldes
	 * @param y
	 *            y-Koordinate des Feldes
	 * @param assetId
	 *            Id des Assets, das gesetzt werden soll.
	 */

	@Override
	public void setAssetInZelle(int x, int y, int assetId) {
		this.gitterFeld[x][y] = assetId;
	}

	/**
	 * Getter für die HeldId.
	 * 
	 * @return Liefert die Id des Helden.
	 */

	@Override
	public int getHeldId() {
		for (AbstraktesAsset asset : assetsList) {
			if (asset instanceof Held) {
				return asset.getId();
			}
		}
		return -1;
	}

	/**
	 * Entferne das Asset assetId vom Spielfeld (Asset-Liste und Feld).
	 * 
	 * @param assetId
	 *            Id des Assets, das entfernt werden soll.
	 */

	@Override
	public void entferneAsset(int assetId) {
		for (int j = 0; assetsList.size() > j; j++) {
			AbstraktesAsset asset = assetsList.get(j);
			if (asset != null && asset.getId() == assetId) {
				assetsList.remove(j);
			}
		}
		for (int[] zeile : gitterFeld) {
			for (int i = 0; zeile.length > i; i++) {
				if (zeile[i] == assetId) {
					zeile[i] = -1;
				}
			}
		}
	}
}