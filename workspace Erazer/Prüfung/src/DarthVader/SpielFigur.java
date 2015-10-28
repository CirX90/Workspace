/**
 * Laborpr�fung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule f�r Angewandte Wissenschaften, Hamburg
 */
package DarthVader;

import java.util.Arrays;
import java.util.List;

/**
 * Eine SpielFigur ist die abstrakte Basisklasse mit gemeinsamer Funktionalität
 * und der gemeinsamen Schnittstelle für andere Spielfiguren.
 * 
 * @author Philipp Jenke
 *
 */
public abstract class SpielFigur {
  /**
   * Name der Spielfigur.
   */
  protected String name;

  /**
   * Eine Liste von Aussagen, die Spielfiguren treffen k�nnten.
   */
  public static final List<String> AUSSAGEN = Arrays.asList(new String[] {
      "Ich bin dein Vater!", "M�ge die Macht mit dir sein!",
      "Durchk�mmt die W�ste!", "Ich muss meinen Freunden helfen!", "Chewee!",
      "Du kennst nicht die Macht der dunklen Seite!" });

  /**
   * Konstruktor mit Initialisierung des Namens.
   * 
   * @param name
   *          Initialier Wert f�r den Namen.
   */
  public SpielFigur(String name) {
    this.name = name;
  }

  /**
   * Getter
   * 
   * @return Name der Spielfigur.
   */
  public String getName() {
    return name;
  }

  /**
   * Die Spielfigur liefert einen f�r sie typischen Satz zur�ck.
   */
  public abstract String sprechen();

}