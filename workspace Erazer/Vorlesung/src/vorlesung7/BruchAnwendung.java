package vorlesung7;

/**
 * Anwendungsklasse f�r Br�che.
 *
 */
public class BruchAnwendung {

  /**
   * Programmeinstiegs-Methode.
   */
  public static void main(String[] args) {
    Bruch bruch = new Bruch();
    bruch.zaehler = 5;
    bruch.nenner = 10;
    bruch.print();
    bruch.vereinfache();
    bruch.print();
  }
}
