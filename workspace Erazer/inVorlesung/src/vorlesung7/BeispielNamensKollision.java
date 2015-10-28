/**
 * Philipp Jenke  
 * Hochschule f�r Angewandte Wissenschaften (HAW) Hamburg
 * Lecture demo program.
 */

package vorlesung7;

/**
 * Beispielklasse für Namenskollisionen bei lokalen Variablen und
 * Objektvariablen.
 * 
 * @author Philipp Jenke
 */
public class BeispielNamensKollision {
  /**
   * An member variable.
   */
  int variable = 23;

  /**
   * In der Methode wird eine lokale Variable mit dem gleichen Namen wie eine
   * Objektvariable deklariert.
   */
  void methode() {
    int variable = 42;
    System.out.println(variable);
    System.out.println(this.variable);
  }

  /**
   * Programmeinstiegs-Methode.
   */
  public static void main(String[] args) {
    BeispielNamensKollision nce = new BeispielNamensKollision();
    nce.methode();
  }
}
