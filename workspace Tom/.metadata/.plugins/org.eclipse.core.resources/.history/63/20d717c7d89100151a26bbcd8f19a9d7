package aufgabenblatt2_0;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * JavaFX-Darstellung des Spielfeldes.
 * 
 * @author Philipp Jenke
 *
 */
public class SpielDarstellung extends Application implements Observer {

	/**
	 * Kommando, um das Spiel zu beenden.
	 */
	private final String KOMMANDO_ENDE = "ende";

	/**
	 * Unter dieser URL wird nach den Bildern gesucht.
	 */
	//private final String ASSET_URL = "http://users.informatik.haw-hamburg.de/~abo781/assets/";

	/**
	 * In diesem Unterverzeichnis des Projektes wird ebenfalls nach den Bildern
	 * gesucht.
	 */
	private final String LOKALES_ASSET_VERZEICHNIS = "assets/";

	/**
	 * Dies ist die alles umschliessende Stage.
	 */
	private Stage stage = null;

	/**
	 * Auf dieser Zeichenfl�che wird das Spielfeld gezeichnet.
	 */
	private Canvas canvas = null;

	/**
	 * Dies ist das Spielsteuerungs-Objekt, mit dem die Spiellogik umgesetzt
	 * wird.
	 */
	private AbstrakteSpielSteuerung spielSteuerung = null;

	/**
	 * Dies ist das Spielfeld-Objekt, das zum Zeichnen verwendet wird.
	 */
	private AbstraktesSpielfeld spielfeld = null;

	/**
	 * In dieser Map wird f�r jedes Asset ein Image abgelegt.
	 */
	private Map<AbstraktesAsset.AssetTyp, Image> assetImageMap = new HashMap<AbstraktesAsset.AssetTyp, Image>();

	/**
	 * In diesem Textfeld werden die Kommandos eingegeben.
	 */
	private TextField textFeldKommandos;

	/**
	 * Programmeinstieg. Started die Darstellung des Spielfeldes.
	 * 
	 * @param stage
	 *            Oberste (primary) Stage.
	 */
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		initialisiereGui(stage);
		initialisierungSpiel();
	}

	/**
	 * Initialisierung des Spiels.
	 */
	private void initialisierungSpiel() {
		SpielInitialisierung init = new SpielInitialisierung();
		spielfeld = init.getSpielfeld();

		ladeSprites(init);

		if (spielfeld != null) {
			spielfeld.addObserver(this);
			zeichneSpielfeld();
		} else {
			System.out
					.println("Achtung: Ung�ltiges Spielfeld. Bitte in der Klasse SpielInitialisierung setzen.");
		}

		spielSteuerung = init.getSpielSteuerung();
		if (spielSteuerung != null) {
			spielSteuerung.setSpielfeld(spielfeld);
		} else {
			System.out
					.println("Achtung: Ung�tige Spielsteuerung. Bitte in der Klasse SpielInitialisierung setzen.");
		}
	}

	/**
	 * Beendet die Anwendung (das Spiel) unmittelbar.
	 */
	private void spielBeenden() {
		System.out.println("Vielen Dank f�r das Spielen!");
		System.exit(0);
	}

	/**
	 * Initialisierung des Benutzerinterfaces
	 * 
	 * @param stage
	 *            Oberste (primary) Stage.
	 */
	public void initialisiereGui(Stage stage) {

		int GROESSE = 400;

		stage.setTitle("PM1/PT Spiel");
		BorderPane wurzelKnoten = new BorderPane();

		// Zeichenfläche
		canvas = new Canvas(GROESSE, GROESSE);
		wurzelKnoten.setCenter(canvas);

		// Text-Eingabe
		BorderPane kommandoPane = new BorderPane();
		textFeldKommandos = new TextField("ende");
		kommandoPane.setCenter(textFeldKommandos);
		Button buttonKommandos = new Button("Los");
		kommandoPane.setRight(buttonKommandos);
		wurzelKnoten.setBottom(kommandoPane);

		// Handler für die Eingabe registrieren
		buttonKommandos.setOnAction((ActionEvent e) -> {
			verarbeiteKommando();
		});
		textFeldKommandos.setOnKeyReleased((KeyEvent ke) -> {
			if (ke.getCode().equals(KeyCode.ENTER)) {
				verarbeiteKommando();
			}
		});

		// Anwendung beenden, wenn das Fenster geschlossen wurde.
		stage.setOnCloseRequest((WindowEvent we) -> {
			spielBeenden();
		});

		Scene scene = new Scene(wurzelKnoten, GROESSE, GROESSE + 100);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	/**
	 * Verarbeiten des aktuellen Kommandos (im Textfeld).
	 */
	private void verarbeiteKommando() {
		final String kommando = textFeldKommandos.getText();
		switch (kommando) {
		case KOMMANDO_ENDE:
			spielBeenden();
			break;
		default:
			if (spielSteuerung != null) {
				spielSteuerung.spielzug(kommando);
			} else {
				System.out
						.println("Bitte zunächst Spielsteuerungs-Objekt in Klasse SpielInitialisierung setzen.");
			}
		}
	}

	/**
	 * Zeichnen des Spielfeld aus Gitter und Assets.
	 */
	private void zeichneSpielfeld() {
		// Alte Zeichenelemente löschen.
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
		gc.setFill(Color.WHITE);

		final int RAND = 15;
		final int RAND_FENSTER_OBEN = 10;
		double spielfeldBreite = Math.min(stage.getWidth(), stage.getHeight())
				- (RAND * 2 + RAND_FENSTER_OBEN);
		double zellGroesse = spielfeldBreite / (double) spielfeld.getLaenge();

		// Waagerechte Linien
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(1);
		gc.beginPath();
		for (int zeile = 0; zeile <= spielfeld.getLaenge(); zeile++) {
			double y = RAND_FENSTER_OBEN + RAND + zeile * zellGroesse;
			gc.moveTo(RAND, y);
			gc.lineTo(RAND + spielfeldBreite, y);
			gc.stroke();
		}

		// Senkrechte Linien
		for (int spalte = 0; spalte <= spielfeld.getLaenge(); spalte++) {
			double x = RAND + spalte * zellGroesse;
			gc.moveTo(x, RAND_FENSTER_OBEN + RAND);
			gc.lineTo(x, RAND_FENSTER_OBEN + RAND + spielfeldBreite);
			gc.stroke();
		}
		gc.closePath();

		// Assets
		for (int zeile = 0; zeile < spielfeld.getLaenge(); zeile++) {
			for (int spalte = 0; spalte < spielfeld.getLaenge(); spalte++) {
				int assetId = spielfeld.getAssetInZelle(zeile, spalte);
				if (assetId >= 0) {
					AbstraktesAsset asset = spielfeld.getAsset(assetId);
					zeichneAsset(gc, zeile, spalte, asset, RAND,
							RAND_FENSTER_OBEN, zellGroesse);
				}
			}
		}
	}

	/**
	 * Laden der Sprites zu allen Assets.
	 * 
	 * @param init
	 *            Das Initialisierungs-Objekt wird benötigt, weil dort die
	 *            Dateinamen der Bilder für die Assets zu finden sind.
	 */
	private void ladeSprites(SpielInitialisierung init) {
		for (AbstraktesAsset.AssetTyp assetTyp : AbstraktesAsset.AssetTyp
				.values()) {
			ladeAssetBild(assetTyp, init.getAssetDateiname(assetTyp));
		}
	}

	/**
	 * Einlesen eines Bildes für ein Asset.
	 * 
	 * @param typ
	 *            Typ des Assets
	 * @param dateiName
	 *            Dateiname des zugehörigen Bildes.
	 */
	private void ladeAssetBild(AbstraktesAsset.AssetTyp typ, String dateiName) {

		// Lade Bild aus URL
		/**
		 * String bildUrl = ASSET_URL + dateiName; Image image = new
		 * Image(bildUrl); if (!image.isError()) { assetImageMap.put(typ,
		 * image); System.out.println("Bild " + dateiName +
		 * " erfolgreich aus URL " + ASSET_URL + " geladen."); return; }
		 */

		// Lade Bild aus Ordner assets
		String lokalerBildPfad = "assets/" + dateiName;
		if (new File(lokalerBildPfad).exists()) {
			Image image = new Image("file:" + lokalerBildPfad);
			assetImageMap.put(typ, image);
			System.out.println("Bild " + dateiName
					+ " erfolgreich aus Verzeichnis "
					+ LOKALES_ASSET_VERZEICHNIS + " geladen.");
			return;
		}

		System.out.println("Bild " + dateiName
				+ " konnte nicht gefunden werden.");

	}

	/**
	 * Zeichne das Asset in der angegebenen Zelle
	 * 
	 * @param gc
	 *            Auf diesem Kontext wird gezeichnet.
	 * @param zeile
	 *            Zeilenindex der Zelle.
	 * @param spalte
	 *            Spaltenindex der Zelle.
	 * @param asset
	 *            Asset in der Zelle.
	 * @param RAND
	 *            Rand um Spielfeld in Pixeln.
	 * @param RAND_FENSTER_OBEN
	 *            Zusätzlicher Rand oben.
	 * @param zellGroesse
	 *            Größe einer Zelle.
	 */
	private void zeichneAsset(GraphicsContext gc, int zeile, int spalte,
			AbstraktesAsset asset, final int RAND, final int RAND_FENSTER_OBEN,
			double zellGroesse) {
		if (asset == null) {
			return;
		}
		Image bild = assetImageMap.get(asset.getTyp());
		if (bild == null) {
			return;
		}
		// Bild auf Zellgröße skalieren
		ImageView fittedImageView = new ImageView(bild);
		fittedImageView.setSmooth(false);
		fittedImageView.setFitWidth(zellGroesse - 4);
		fittedImageView.setFitHeight(zellGroesse - 4);
		// Bild zeichnen
		gc.drawImage(fittedImageView.snapshot(null, null), RAND + zeile
				* zellGroesse + 1, RAND_FENSTER_OBEN + RAND + spalte
				* zellGroesse + 2);
	}

	@Override
	public void update(Observable observable, Object arg) {
		Platform.runLater(() -> zeichneSpielfeld());
	}

	/**
	 * Zentraler Programmeinstieg.
	 * 
	 * @param args
	 *            Kommandozeilenparameter.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}
}
