package aufgabenblatt7;

import aufgabenblatt7.AbstraktesSpielfeld.Himmelsrichtung;

/**
 * Darstellung der Bewegung der Figur.
 * 
 * @author Tom Hertel
 */

public class SpielSteuerung extends AbstrakteSpielSteuerung {

	/**
	 * Durch eine Switch-Methode mit eingegebenen Kommandos wird die Bewegung
	 * der Figur darstellt. Es wird geprüft ob das Nachbarfeld, wohin sich der
	 * Held bewegen soll, leer ist. Ist dies der Fall lässt sich der Held dahin
	 * bewegen. Ist eine id enthalten und diese zeigt einen Bösewicht, wird
	 * dieser gelöscht und der Held nimmt dessen Postition ein. Sollte ein Loch
	 * auf dem Feld sein, wird der Held gelöscht und das Spiel verloren und
	 * beendet.
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

				else if (this.getSpielfeld().getAsset(assetId) instanceof Loch) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.SUEDEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.SUEDEN);
					this.getSpielfeld().entferneAsset(heldId);
					System.out.println("Du bist in ein Loch gefallen"
							+ " und hast verloren");
					System.exit(0);
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

				else if (this.getSpielfeld().getAsset(assetId) instanceof Loch) {
					this.getSpielfeld().entferneAsset(
							this.getSpielfeld().getAssetIdInRichtung(heldId,
									Himmelsrichtung.WESTEN));
					this.getSpielfeld().bewegeAsset(heldId,
							Himmelsrichtung.WESTEN);
					this.getSpielfeld().entferneAsset(heldId);
					System.out.println("Du bist in ein Loch gefallen"
							+ " und hast verloren");
					System.exit(0);
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
		}

		/**
		 * Beendigungsmöglichkeit (Gewinnen) des Spiels indem die Asssets aus
		 * der Liste mit dem Inhalt eine Bösewichts gezählt werden. Falls diese
		 * Anzahl null erreicht, ist das Spiel gewonnen und wird beendet.
		 */

		int boesewichtZaehler = 0;

		for (int j = 0; this.getSpielfeld().getAnzahlAssets() > j; j++) {
			AbstraktesAsset asset = this.getSpielfeld().getAssetsList().get(j);
			if (asset != null && asset instanceof Boesewicht) {

				boesewichtZaehler++;
			}
		}

		if (boesewichtZaehler == 0) {
			System.out.println("Herzlichen Glückwunsch. Sie haben gewonnen.");
			System.exit(0);
		}
	}
}