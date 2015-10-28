/**
 * Laborprüfung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule für Angewandte Wissenschaften, Hamburg
 */
package DarthVader;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import DarthVader.DarthVader;
import DarthVader.SpielFigur;

/**
 * Testklasse für die Klasse DarthVader
 * 
 * @author Philipp Jenke
 *
 */
public class TestDarthVader extends TestBasisklasse {

  /**
   * Bezeichner der Variablen name.
   */
  private static final String VARIABLE_NAME = "name";

  /**
   * Bezeichner der Methode getAussagenIndex.
   */
  private static final String METHODE_GET_AUSSAGEN_INDEX = "getAussagenIndex";

  /**
   * Bezeichner der Methode sprechen.
   */
  private static final String METHODE_SPRECHEN = "sprechen";

  /**
   * Bezeichner für die Objektvariable Gegner.
   */
  private static final String VARIABLE_GEGNER = "gegner";

  /**
   * Bezeichner der Methode zum Hinzufügen eines Gegners.
   */
  private static final String METHODE_GEGNER_HINZUFUEGEN = "gegnerHinzufuegen";

  /**
   * Bezeichner der Methode getName()
   */
  private static String METHODE_GET_NAME = "getName";

  /**
   * Prüft, ob der Name durch den Konstruktor korrekt gesetzt wurde
   */
  @Test
  public void testDarthVaderSetztNamenKorrekt() {
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    getWertObjektVariableElternklasse(vader, VARIABLE_NAME);
    String name = (String) werteMethodeAus(vader, METHODE_GET_NAME);
    assertNotNull("Kann Methode " + METHODE_GET_NAME + " nicht aufrufen.", name);
    assertEquals("Name wurde nicht korrekt in SpielFigur gesetzt", name.trim(),
        "Darth Vader");
    System.out.println("Test erfolgreich (DarthVader): Name korrekt gesetzt.");
  }

  /**
   * Pr�ft, ob die Methode getAussagenIndex vorhanden ist.
   */
  @Test
  public void testGetAussagenIndexVorhanden() {
    Class<?>[] parameterTypListe = {};
    pruefeHatMethode(DarthVader.class, METHODE_GET_AUSSAGEN_INDEX,
        parameterTypListe);

    System.out.println("Test erfolgreich (DarthVader): Methode "
        + METHODE_GET_AUSSAGEN_INDEX + " vorhanden.");
  }

  /**
   * Prüft, ob die Methode getAussagenIndex die richtige Verteilung von Werten
   * liefert.
   */
  @Test
  public void testGetAussagenIndexRichtigeWerte() {
    Class<?>[] parameterTypListe = {};
    Object[] parameterObjekteListe = {};
    pruefeHatMethode(DarthVader.class, METHODE_GET_AUSSAGEN_INDEX,
        parameterTypListe);
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    int anzahlRueckgabenNull = 0;
    int anzahlRueckgabenZwei = 0;
    int anzahlRueckgabenFuenf = 0;
    int anzahlAufrufe = 10000;

    try {
      for (int i = 0; i < anzahlAufrufe; i++) {
        int index =
            (Integer) werteMethodeAus(vader, METHODE_GET_AUSSAGEN_INDEX,
                parameterTypListe, parameterObjekteListe);
        switch (index) {
          case 0:
            anzahlRueckgabenNull++;
            break;
          case 2:
            anzahlRueckgabenZwei++;
            break;
          case 5:
            anzahlRueckgabenFuenf++;
            break;
        }
      }
      double wahrscheinlichkeitNull =
          (double) anzahlRueckgabenNull / (double) anzahlAufrufe;
      double wahrscheinlichkeitZwei =
          (double) anzahlRueckgabenZwei / (double) anzahlAufrufe;
      double wahrscheinlichkeitFuenf =
          (double) anzahlRueckgabenFuenf / (double) anzahlAufrufe;
      assertTrue("Wert 0 wird zu selten oder zu häufig zurückgegeben.",
          wahrscheinlichkeitNull > 0.3 && wahrscheinlichkeitNull < 0.4);
      assertTrue("Wert 2 wird zu selten oder zu häufig zurückgegeben.",
          wahrscheinlichkeitZwei > 0.3 && wahrscheinlichkeitZwei < 0.4);
      assertTrue("Wert 5 wird zu selten oder zu häufig zurückgegeben.",
          wahrscheinlichkeitFuenf > 0.3 && wahrscheinlichkeitFuenf < 0.4);
    } catch (Exception e) {
      assertTrue("Fehler beim Aufruf der Metode " + METHODE_GET_AUSSAGEN_INDEX
          + ".", false);
    }

    System.out.println("Test erfolgreich (DarthVader): Methode "
        + METHODE_GET_AUSSAGEN_INDEX
        + " liefert die richtige Verteilung von Werten.");
  }

  /**
   * Prüft, ob die Methode sprechen Darth-Vader-Aussagen liefert.
   */
  @Test
  public void testSprechenLiefertDarthVaderSaetze() {
    Set<String> darthVaderAussagen =
        new HashSet<String>(Arrays.asList(new String[] {
            SpielFigur.AUSSAGEN.get(0), SpielFigur.AUSSAGEN.get(2),
            SpielFigur.AUSSAGEN.get(5) }));
    int anzahlTests = 100;
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    for (int i = 0; i < anzahlTests; i++) {
      String aussage = (String) werteMethodeAus(vader, METHODE_SPRECHEN);
      assertTrue("Darth Vader sagt Nicht-Darth-Vader-Aussagen", aussage != null
          && darthVaderAussagen.contains(aussage));
    }
    System.out.println("Test erfolgreich (DarthVader): Methode "
        + METHODE_SPRECHEN + " liefert Darth-Vader-Aussagen.");
  }

  /**
   * Prüft, ob die Methode sprechen Darth-Vader-Aussagen etwa gleichverteilt
   * liefert.
   */
  @Test
  public void testSprechenLiefertDarthVaderSaetzeVerteilung() {
    List<String> darthVaderAussagen =
        Arrays.asList(new String[] { SpielFigur.AUSSAGEN.get(0),
            SpielFigur.AUSSAGEN.get(2), SpielFigur.AUSSAGEN.get(5) });
    int anzahlTests = 10000;
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    for (int i = 0; i < 3; i++) {
      String aktuelleAussage = darthVaderAussagen.get(i);
      double anzahlAussagen = 0;
      for (int j = 0; j < anzahlTests; j++) {
        String aussage = (String) werteMethodeAus(vader, METHODE_SPRECHEN);
        if (aussage != null && aussage.equals(aktuelleAussage)) {
          anzahlAussagen++;
        }
      }
      assertTrue("Aussage " + aktuelleAussage + " zu häufig oder zu selten.",
          anzahlAussagen / anzahlTests > 0.3
              && anzahlAussagen / anzahlTests < 0.4);
    }
    System.out.println("Test erfolgreich (DarthVader): Methode "
        + METHODE_SPRECHEN + " liefert gleichverteilt Darth-Vader-Aussagen.");
  }

  /**
   * Prüft, ob die Variable gegner existiert.
   */
  @Test
  public void testHatObjektvariableGegner() {
    testHatObjektVariable(DarthVader.class, VARIABLE_GEGNER, SpielFigur[].class);
    System.out
        .println("Test erfolgreich (DarthVader): Klasse DarthVader hat Objektvariable "
            + VARIABLE_GEGNER + ".");
  }

  /**
   * Pr�ft, ob die Variable gegner existiert.
   */
  @Test
  public void testObjektvariableGegnerLeerInitialisiert() {
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    SpielFigur[] gegner =
        (SpielFigur[]) getWertObjektVariable(vader, VARIABLE_GEGNER);
    assertNotNull("Gegner-Array soll nicht null sein.", gegner);
    assertTrue("Gegner-Array soll initial die Länge 0 haben",
        gegner.length == 0);
    System.out.println("Test erfolgreich (DarthVader): Objektvariable "
        + VARIABLE_GEGNER + " ist als leeres Array initialisiert.");
  }

  /**
   * Prüft, ob die Methode gegnerHinzufuegen vorhanden ist.
   */
  @Test
  public void testHatMethodeGegnerHinzufuegen() {
    Class<?>[] parameterTypListe = { SpielFigur.class };
    pruefeHatMethode(DarthVader.class, METHODE_GEGNER_HINZUFUEGEN,
        parameterTypListe);
    System.out
        .println("Test erfolgreich (DarthVader): Klasse DarthVader hat Methode "
            + METHODE_GEGNER_HINZUFUEGEN + ".");
  }

  /**
   * Pr�ft, ob die Methode gegnerHinzufuegen funktioniert.
   */
  @Test
  public void testGegnerHinzufuegen() {
    DarthVader vader = (DarthVader) erzeugeInstanz(DarthVader.class);
    DarthVader gegner1 = (DarthVader) erzeugeInstanz(DarthVader.class);
    DarthVader gegner2 = (DarthVader) erzeugeInstanz(DarthVader.class);

    Class<?>[] parameterTypListe = { SpielFigur.class };
    Object[] parameterWertListe = { gegner1 };

    try {
      werteMethodeAus(vader, METHODE_GEGNER_HINZUFUEGEN, parameterTypListe,
          parameterWertListe);
      SpielFigur[] gegnerListe =
          (SpielFigur[]) getWertObjektVariable(vader, VARIABLE_GEGNER);
      assertEquals("Gegnerliste sollte die L�nge 1 haben.", gegnerListe.length,
          1);
      assertEquals("Gegner nicht in Liste eingetragen.", gegnerListe[0],
          gegner1);
      parameterWertListe = new Object[] { gegner2 };
      werteMethodeAus(vader, METHODE_GEGNER_HINZUFUEGEN, parameterTypListe,
          parameterWertListe);
      gegnerListe =
          (SpielFigur[]) getWertObjektVariable(vader, VARIABLE_GEGNER);
      assertEquals("Gegnerliste sollte die Länge 2 haben.", gegnerListe.length,
          2);
      assertEquals("Gegner aus Liste verloren gegangen.", gegnerListe[0],
          gegner1);
      assertEquals("Gegner nicht in Liste eingetragen.", gegnerListe[1],
          gegner2);
    } catch (Exception e) {
      assertTrue("Fehler beim Ausf�hren der Methode "
          + METHODE_GEGNER_HINZUFUEGEN + ".", false);
    }
    System.out
        .println("Test erfolgreich (DarthVader): Klasse DarthVader hat Methode "
            + METHODE_GEGNER_HINZUFUEGEN + ".");
  }

}