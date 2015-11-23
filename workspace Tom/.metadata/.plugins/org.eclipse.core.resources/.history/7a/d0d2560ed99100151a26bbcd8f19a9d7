package aufgabenblatt7;

import java.util.List;
import java.util.Observable;

/**
 * Dieses abstrakte Basisklasse beschreibt das Spielfeld.
 * 
 * @author Philipp Jenke
 *
 */
public abstract class AbstraktesSpielfeld extends Observable {

  /**
   * Zur Beschreibung der Himmelsrichtungen.
   */
  public enum Himmelsrichtung {
    NORDEN, SUEDEN, WESTEN, OSTEN
  };

  /**
   * Diese Methode wird aufgerufen, wenn sich das Spielfeld geändert hat. Dann
   * wird die Szene automatisch neu gezeichnet.
   */
  public void hatSichGeaendert() {
    setChanged();
    notifyObservers();
  }

  /**
   * Hilfsmethode zur Steuerung: Bewegen das Asset mit der Id assetId in die
   * angegebene Himmelsrichtung. Achtung: Es wird nicht geprüft, ob das Feld
   * frei oder auch nur gültig ist!.
   * 
   * @param assetId
   *          Id des Assets, das bewegt werden soll.
   * @param richtung
   *          Richtung in die bewegt wird.
   */
  public void bewegeAsset(int assetId, Himmelsrichtung richtung) {
    int deltaX = 0;
    int deltaY = 0;
    switch (richtung) {
      case NORDEN:
        deltaY = -1;
        break;
      case SUEDEN:
        deltaY = 1;
        break;
      case WESTEN:
        deltaX = -1;
        break;
      case OSTEN:
        deltaX = 1;
        break;
    }
    boolean done = false;
    for (int x = 0; x < getLaenge() && !done; x++) {
      for (int y = 0; y < getLaenge() && !done; y++) {
        if (getAssetInZelle(x, y) == assetId) {
          setAssetInZelle(x, y, -1);
          setAssetInZelle(x + deltaX, y + deltaY, assetId);
          done = true;
        }
      }
    }
    hatSichGeaendert();
  }

  /**
   * Hilfsmethode zur Steuerung: Prüft, ob das Nachbarfeld eines Assets in einer
   * bestimmten Himmelsrichtung leer ist.
   * 
   * @param assetId
   *          Id des Assets dessen Nachbarfeld gebrüft werden soll.
   * @param richtung
   *          Himmelsrichtung (aus Sicht des Assets) in der das zu prüfende Feld
   *          liegt.
   * @return Wahr, wenn das Feld leer ist, falsch sonst.
   */
  public boolean nachbarfeldIstLeer(int assetId, Himmelsrichtung richtung) {
    int deltaX = 0;
    int deltaY = 0;
    switch (richtung) {
      case NORDEN:
        deltaY = -1;
        break;
      case SUEDEN:
        deltaY = 1;
        break;
      case WESTEN:
        deltaX = -1;
        break;
      case OSTEN:
        deltaX = 1;
        break;
    }
    for (int x = 0; x < getLaenge(); x++) {
      for (int y = 0; y < getLaenge(); y++) {
        if (getAssetInZelle(x, y) == assetId) {
          if (!istGueltigerFeldIndex(x + deltaX, y + deltaY)) {
            return false;
          }
          return getAssetInZelle(x + deltaX, y + deltaY) < 0;
        }
      }
    }
    return false;
  }

  /**
   * Hilfsmethode zur Steuerung: Liefert die Id des Assets in der Nachbarzelle
   * des Assets mit der Id assetId in der gegebenen Himmelsrichtung.
   * 
   * @param assetId
   *          Id des Assets von dem aus die Nachbarzelle betrachtet werden soll.
   * 
   * @param himmelsrichtung
   *          Himmelsrichtung in der die Nachbarzelle aus Sicht des Assets
   *          liegt.
   * 
   * @return Liefert die Id des Assets in der Nachbarzelle.Liefert -1, falls die
   *         Zelle leer oder ungültig ist.
   */
  public int getAssetIdInRichtung(int assetId, Himmelsrichtung himmelsrichtung) {
    int deltaX = 0;
    int deltaY = 0;
    switch (himmelsrichtung) {
      case NORDEN:
        deltaY = -1;
        break;
      case SUEDEN:
        deltaY = 1;
        break;
      case WESTEN:
        deltaX = -1;
        break;
      case OSTEN:
        deltaX = 1;
        break;
    }
    for (int x = 0; x < getLaenge(); x++) {
      for (int y = 0; y < getLaenge(); y++) {
        if (getAssetInZelle(x, y) == assetId) {
          if (!istGueltigerFeldIndex(x + deltaX, y + deltaY)) {
            return -1;
          }
          return getAssetInZelle(x + deltaX, y + deltaY);
        }
      }
    }
    return -1;
  }

  /**
   * Hilfsmethode zur Steuerung: Prüft, ob der gegebene Feldindex gültig ist,
   * also im Feld liegt.
   * 
   * @param x
   *          x-Koordinate des Feldes.
   * @param y
   *          y-Koordinate des Feldes.
   * @return Wahr, wenn der Index gültig ist, falsch ansonsten.
   */
  protected boolean istGueltigerFeldIndex(int x, int y) {
    return !(x < 0 || x >= getLaenge() || y < 0 || y >= getLaenge());
  }

  // *** DIE FOLGENDEN METHODEN MÜSSEN SIE IN ABGELEITETEN KLASSEN
  // IMPLEMENTIEREN! ***

  /**
   * Getter.
   * 
   * @return Liefert die Anzahl der Felder einer Zeile im quadratischen
   *         Spielfeld.
   */
  public abstract int getLaenge();

  /**
   * Getter.
   * 
   * @return Liefert die Anzahl der Assets im Spiel.
   */
  public abstract int getAnzahlAssets();

  /**
   * Getter.
   * 
   * @param id
   *          Id des gesuchten Assets.
   * @return Asset mit der gegebenen Id.
   */
  public abstract AbstraktesAsset getAsset(int id);

  /**
   * Liefert die Id des Assets in dem Feld mit den Koordinaten (x,y).
   * 
   * @param x
   *          x-Koordinate
   * @param y
   *          y-Koordinate
   * @return Id des Assets in der Zelle. -1, falls das Feld ungültig oder leer
   *         ist.
   */
  public abstract int getAssetInZelle(int x, int y);

  /**
   * Hilfsmethode zur Steuerung: Setzt das Asset mit der Id assetId in das Feld
   * (x,y).
   * 
   * @param x
   *          x-Koordinate des Feldes
   * @param y
   *          y-Koordinate des Feldes
   * @param assetId
   *          Id des Assets, das gesetzt werden soll.
   */
  public abstract void setAssetInZelle(int x, int y, int assetId);

  /**
   * Getter.
   * 
   * @return Liefert die Id des Helden. Es muss immer einen Helden geben!
   */
  public abstract int getHeldId();

  /**
   * Entferne das Asset assetId vom Spielfeld (Asset-Liste und Feld).
   * 
   * @param assetId
   *          Id des Assets, das entfernt werden soll.
   */
  public abstract void entferneAsset(int assetId);
  
  /**
   * Liefert die Liste der erstellent Assets.
   * 
   * @return List<AbstraktesAsset>	  
   */
  
  public abstract List<AbstraktesAsset> getAssetsList();
}