package vorlesung7;

/**
 * Gibt verschiedene Typen auf der Konsole aus.
 */
public class Ausgabe {

  /**
   * Ausgeben eines int-Werts.
   */
  public void ausgeben(int wert) {
    System.out.format("%d\n", wert);
  }

  /**
   * Ausgeben eines double-Werts.
   */
  public void ausgeben(double wert) {
    System.out.format("%f\n", wert);
  }

  /**
   * Ausgeben eines String-Werts.
   */
  public void ausgeben(String wert) {
    System.out.format("%s\n", wert);
  }

  /**
   * Ausgeben eines Bruchs.
   */
  public void ausgeben(Bruch bruch) {
    bruch.print();
  }

  /**
   * Programmeinstieg.
   */
  public static void main(String[] args) {
    Ausgabe ausgabe = new Ausgabe();
    ausgabe.ausgeben(23);
    ausgabe.ausgeben(23.42);
    ausgabe.ausgeben("Test");
    Bruch bruch = new Bruch();
    bruch.zaehler = 23;
    bruch.nenner = 42;
    ausgabe.ausgeben(bruch);
  }

}
