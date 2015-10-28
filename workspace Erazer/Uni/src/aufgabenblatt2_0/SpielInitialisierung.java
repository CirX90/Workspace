package aufgabenblatt2_0;

/**
 * In dieser Klasse findet die Initialisierung des Spiels statt.
 * 
 * @author Philipp Jenke
 *
 */
public class SpielInitialisierung {

  /**
   * Hier muss ein ISpielfeld-Objekt erzeugt werden. Das muss die Assets
   * enthalten.
   * 
   * @return ISpielfeld-Objekt.
   */
  public AbstraktesSpielfeld getSpielfeld() {
    // Hier ein Spielfeld-Objekt erzeugen und zurückliefern.
    return new Spielfeld();
  }

  /**
   * Getter.
   * 
   * @return In dieser Methode muss das Spielsteuerungsmodul zurückgeliefert
   *         werden.
   */
  public AbstrakteSpielSteuerung getSpielSteuerung() {
    // Hier ein SpielSteuerungs-Objekt erzeugen und zurückliefern.
    return new SpielSteuerung();
  }

  /**
   * Liefert den Pfad und Dateinamen des Bildes zum gegebenen AssetTyp.
   * 
   * @param assetTyp
   *          AssetTyp, für das der Bild-Pfad geliefert werden soll.
   * 
   * @return Dateiname mit (relativem) Pfad.
   */
  public String getAssetDateiname(AbstraktesAsset.AssetTyp assetTyp) {
    switch (assetTyp) {
      case HELD:
        return "chris.png";
      case BOESEWICHT:
        return "boesewicht.png";
      case BAUM:
        return "baum.png";
      case WAND:
        return "wand.png";
      case LOCH:
          return "loch.png";
      case HAUS:
          return "haus2.png";    
      default:
        System.out.println("Unbekannter AssetTyp: " + assetTyp);
    }
    return null;
  }
}
