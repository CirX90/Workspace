package aufgabenblatt2_0;

import aufgabenblatt2_0.AbstraktesSpielfeld.Himmelsrichtung;

/**
 *
 * @author Tom Hertel
 */
public class SpielSteuerung extends AbstrakteSpielSteuerung {

	/**
	 * Abstrakte Methode spielzug wird geerbt.
	 */

	@Override
	public void spielzug(String kommando) {
		int heldId;
		int assetId;

		switch (kommando) {
		case "nord":
			heldId = this.getSpielfeld().getHeldId();
			assetId = this.getSpielfeld().getAssetIdInRichtung(heldId,
					Himmelsrichtung.NORDEN);
			if (this.getSpielfeld().nachbarfeldIstLeer(heldId,
					Himmelsrichtung.NORDEN)) {
				this.getSpielfeld().bewegeAsset(heldId, Himmelsrichtung.NORDEN);
			}

			else if (assetId > 0) {
				if (this.getSpielfeld().getAsset(assetId) instanceof Boesewicht) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.NORDEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.NORDEN);
				}

				else if (this.getSpielfeld().getAsset(assetId) instanceof Loch) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.NORDEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.NORDEN);
					this.getSpielfeld().entferneAsset(heldId);
					System.out.println("Du bist in ein Loch gefallen"
							+ " und hast verloren");
					System.exit(0);
				}

			}
			break;
		case "sued":
			heldId = this.getSpielfeld().getHeldId();
			assetId = this.getSpielfeld().getAssetIdInRichtung(heldId,
					Himmelsrichtung.SUEDEN);
			if (this.getSpielfeld().nachbarfeldIstLeer(heldId,
					Himmelsrichtung.SUEDEN)) {
				this.getSpielfeld().bewegeAsset(heldId, Himmelsrichtung.SUEDEN);
			}

			else if (assetId > 0) {
				if (this.getSpielfeld().getAsset(assetId) instanceof Boesewicht) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.SUEDEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.SUEDEN);
				}
			}
			break;
		case "west":
			heldId = this.getSpielfeld().getHeldId();
			assetId = this.getSpielfeld().getAssetIdInRichtung(heldId,
					Himmelsrichtung.WESTEN);
			if (this.getSpielfeld().nachbarfeldIstLeer(heldId,
					Himmelsrichtung.WESTEN)) {
				this.getSpielfeld().bewegeAsset(heldId, Himmelsrichtung.WESTEN);
			}

			else if (assetId > 0) {
				if (this.getSpielfeld().getAsset(assetId) instanceof Boesewicht) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.WESTEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.WESTEN);
				}
			}
			break;
		case "ost":
			heldId = this.getSpielfeld().getHeldId();
			assetId = this.getSpielfeld().getAssetIdInRichtung(heldId,
					Himmelsrichtung.OSTEN);
			if (this.getSpielfeld().nachbarfeldIstLeer(heldId,
					Himmelsrichtung.OSTEN)) {
				this.getSpielfeld().bewegeAsset(heldId, Himmelsrichtung.OSTEN);
			}

			else if (assetId > 0) {
				if (this.getSpielfeld().getAsset(assetId) instanceof Boesewicht) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.OSTEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.OSTEN);
				} else if (this.getSpielfeld().getAsset(assetId) instanceof Loch) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.OSTEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.OSTEN);
					this.getSpielfeld().entferneAsset(heldId);
					System.out.println("Du bist in ein Loch gefallen"
							+ " und hast verloren");
					System.exit(0);
				}
			}
			break;
		case "ende":
			System.exit(0);
			break;
		}

		if (this.getSpielfeld().getAnzahlAssets() == 24) {
			System.out.println("Herzlichen Glückwunsch. Sie haben gewonnen.");
			System.exit(0);
		}
	}
}