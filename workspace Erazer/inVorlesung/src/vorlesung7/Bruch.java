package vorlesung7;

/**
 * Ein Bruch besteht aus einem Z‰hler und einem Nenner.
 */
class Bruch {

  /**
   * Z‰hler.
   */
  int zaehler;

  /**
   * Nenner.
   */
  int nenner;

  /**
   * Initialisierung des Zustandes des Bruches (der Objektvariablen).
   */
  void initialisiere(int zaehler, int nenner) {
    this.zaehler = zaehler;
    this.nenner = nenner;
  }

  /**
   * Initialisierung des Zustandes des Bruches (der Objektvariablen) auf einen
   * konkrete (ganzzahligen) Wert.
   */
  void initialisiere(int wert) {
    this.zaehler = wert;
    this.nenner = 1;
  }

  /**
   * Beschreibung des Objektzustands auf der Konsole ausgeben.
   */
  void print() {
    System.out.format("%d/%d\n", zaehler, nenner);
  }

  /**
   * Vereinfache den Bruch soweit mˆglich (durch Division durch den GGT).
   */
  void vereinfache() {
    int gcd = berechneGgt(zaehler, nenner);
    zaehler /= gcd;
    nenner /= gcd;
  }

  /**
   * Erweiterung des Bruches um einen Faktor (Multiplikation von Zaehler und
   * Nenner).
   */
  void erweitere(int faktor) {
    zaehler *= faktor;
    nenner *= faktor;
  }

  /**
   * Berechnet den GGT (grˆﬂten gemeinsamen Teiler) zweier Zahlen mit dem
   * Algorithmus von Euklid. Liefert das Ergebnis zur¸ck.
   */
  int berechneGgt(int zahl1, int zahl2) {
    // Sicherstellung, dass beide Zahlen positiv sind
    zahl1 = Math.abs(zahl1);
    zahl2 = Math.abs(zahl2);

    // Algorithmus von Euklid
    int ergebnis = 0;
    if (zahl1 == 0) {
      ergebnis = zahl2;
    } else {
      while (zahl2 != 0) {
        if (zahl1 > zahl2) {
          zahl1 = zahl1 - zahl2;
        } else {
          zahl2 = zahl2 - zahl1;
        }
      }
      ergebnis = zahl1;
    }
    return ergebnis;
  }

  /**
   * Addiere zweiten Bruch zum this-Objekt, speichere Ergebnis im this-Objekt.
   */
  void addiereDazu(Bruch andererBruch) {
    zaehler =
        zaehler * andererBruch.nenner
            + andererBruch.zaehler * nenner;
    nenner = nenner * andererBruch.nenner;
    vereinfache();
  }

  /**
   * Liefert den (Flieﬂkomma-)Wert des Bruches.
   */
  double getWert() {
    return (double) zaehler / (double) nenner;
  }

  /**
   * Verdoppelt den Wert des Bruchs (Verdeopplung des Z‰hlers).
   */
  void verdopple() {
    zaehler *= 2;
  }

  /**
   * Subtrahiere zweiten Bruch vom this-Objekt, speichere Ergebnis im
   * this-Objekt.
   */
  void subtrahiereDavon(Bruch andererBruch) {
    zaehler =
        zaehler * andererBruch.nenner
            - andererBruch.zaehler * nenner;
    nenner = nenner * andererBruch.nenner;
    vereinfache();
  }

  /**
   * Pr‰dikat, das wahr liefert, wenn der Bruch einen kleinern Wert hat, als der
   * Bruch, der sich aus den Parametern ergibt.
   */
  boolean istKleiner(int zaehler, int nenner) {
    return getWert() < (double) zaehler / (double) nenner;
  }

  /**
   * Pr‰dikat, das wahr liefert, wenn der Bruch einen kleineren Wert hat, als
   * die Parameter-Zahl.
   */
  boolean istKleiner(int zahl) {
    return istKleiner(zahl, 1);
  }

}
