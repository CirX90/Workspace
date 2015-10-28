/**
 * Laborprüfung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */
package DarthVader;

import java.util.Arrays;
import java.util.List;

/**
 * Eine SpielFigur ist die abstrakte Basisklasse mit gemeinsamer FunktionalitÃ¤t
 * und der gemeinsamen Schnittstelle fÃ¼r andere Spielfiguren.
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
   * Eine Liste von Aussagen, die Spielfiguren treffen könnten.
   */
  public static final List<String> AUSSAGEN = Arrays.asList(new String[] {
      "Ich bin dein Vater!", "Möge die Macht mit dir sein!",
      "Durchkämmt die Wüste!", "Ich muss meinen Freunden helfen!", "Chewee!",
      "Du kennst nicht die Macht der dunklen Seite!" });

  /**
   * Konstruktor mit Initialisierung des Namens.
   * 
   * @param name
   *          Initialier Wert für den Namen.
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
   * Die Spielfigur liefert einen für sie typischen Satz zurück.
   */
  public abstract String sprechen();

}