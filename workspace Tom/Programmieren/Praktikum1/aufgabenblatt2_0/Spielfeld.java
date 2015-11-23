package aufgabenblatt2_0;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tom Hertel
 */
public class Spielfeld extends AbstraktesSpielfeld {

	private List<AbstraktesAsset> assetsList;
	private int[][] gitterFeld;

	public Spielfeld() {
		assetsList = new ArrayList<AbstraktesAsset>();
		gitterFeld = new int[7][7];
		for (int[] spalte : gitterFeld) {
			for (int i = 0; spalte.length > i; i++) {
				spalte[i] = -1;
			}
		}

		AbstraktesAsset hinzufügElement;

		// Wände
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(0, 1, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(0, 2, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(0, 6, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(1, 2, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(1, 6, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(3, 4, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(3, 5, hinzufügElement.getId());
		hinzufügElement = new Wand();
		assetsList.add(hinzufügElement);
		setAssetInZelle(6, 0, hinzufügElement.getId());

		// Bäume
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(2, 0, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(2, 2, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(2, 3, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(3, 2, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(3, 3, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(4, 1, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(4, 2, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(5, 2, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(5, 3, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(5, 4, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(5, 6, hinzufügElement.getId());
		hinzufügElement = new Baum();
		assetsList.add(hinzufügElement);
		setAssetInZelle(6, 6, hinzufügElement.getId());

		// Held
		hinzufügElement = new Held();
		assetsList.add(hinzufügElement);
		setAssetInZelle(1, 0, hinzufügElement.getId());

		// Haus
		hinzufügElement = new Haus();
		assetsList.add(hinzufügElement);
		setAssetInZelle(0, 0, hinzufügElement.getId());

		// Loch
		hinzufügElement = new Loch();
		assetsList.add(hinzufügElement);
		setAssetInZelle(1, 4, hinzufügElement.getId());
		hinzufügElement = new Loch();
		assetsList.add(hinzufügElement);
		setAssetInZelle(2, 4, hinzufügElement.getId());

		// Bösewicht
		hinzufügElement = new Boesewicht();
		assetsList.add(hinzufügElement);
		setAssetInZelle(1, 3, hinzufügElement.getId());
		hinzufügElement = new Boesewicht();
		assetsList.add(hinzufügElement);
		setAssetInZelle(4, 3, hinzufügElement.getId());
		hinzufügElement = new Boesewicht();
		assetsList.add(hinzufügElement);
		setAssetInZelle(5, 1, hinzufügElement.getId());

	}

	@Override
	public int getLaenge() {
		return gitterFeld.length;
	}

	@Override
	public int getAnzahlAssets() {
		return assetsList.size();
	}

	@Override
	public AbstraktesAsset getAsset(int id) {
		for (AbstraktesAsset asset : assetsList) {
			if (asset.getId() == id) {
				return asset;
			}
		}
		return null;
	}

	@Override
	public int getAssetInZelle(int x, int y) {
		return gitterFeld[x][y];
	}

	@Override
	public void setAssetInZelle(int x, int y, int assetId) {
		this.gitterFeld[x][y] = assetId;
	}

	@Override
	public int getHeldId() {
		for (AbstraktesAsset asset : assetsList) {
			if (asset instanceof Held) {
				return asset.getId();
			}
		}
		return -1;
	}

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