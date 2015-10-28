/**
 * Laborpr�fung TI-Programmiertechnik.
 * Sommersemester 2015
 * Hochschule f�r Angewandte Wissenschaften, Hamburg
 */
package DarthVader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Die Klasse beinhaltet gemeinsame Funktionalit�t f�r die davon erbenden
 * Testklassen, die einzelne Klassen testen.
 * 
 * @author Philipp Jenke
 *
 */
public abstract class TestBasisklasse {
  /**
   * Pr�ft, ob ein Sichtbarkeitsmodifizierer public ist.
   */
  protected static final Predicate<Integer> istPublic =
      (Integer modifizierer) -> {
        return Modifier.isPublic(modifizierer);
      };

  /**
   * Pr�ft, ob ein Sichtbarkeitsmodifizierer private ist.
   */
  protected static final Predicate<Integer> istPrivate =
      (Integer modifizierer) -> {
        return Modifier.isPrivate(modifizierer);
      };

  /**
   * Pr�ft, ob ein Sichtbarkeitsmodifizierer private ist.
   */
  protected static final Predicate<Integer> istStatic =
      (Integer modifizierer) -> {
        return Modifier.isStatic(modifizierer);
      };

  /**
   * Bezeichner der Methode valueOf.
   */
  private static final String METHODE_VALUE_OF = "valueOf";

  /**
   * Prüft, ob die Sichtbarkeit der Methode methodenName mit der Parameterliste
   * parameterTypen dem Sichtbarkeitsprädikat entspricht.
   * 
   * @param klasse
   *          Klasse in der die Methode getestet werden soll.
   * @param methodenBezeichner
   *          Name der Methode, die überprüft werden soll.
   * @param parameterTypen
   *          Parameterliste der Methode.
   * @param sichtbarkeitsPraedikat
   *          Dieses Prädikat prüft, ob der Modifizierer den Anforderungen
   *          entspricht.
   */
  protected void pruefeMethodenModifizierer(Class<?> klasse,
      String methodenBezeichner, Class<?>[] parameterTypen,
      Predicate<Integer> sichtbarkeitsPraedikat) {
    try {
      Method methode =
          klasse.getDeclaredMethod(methodenBezeichner, parameterTypen);
      methode.setAccessible(true);
      int modifizierer = methode.getModifiers();
      assertTrue(
          "Methode " + methodenBezeichner + " in Klasse " + klasse.getName()
              + " entspricht nicht der geforderten Sichtbarkeit.",
          sichtbarkeitsPraedikat.test(modifizierer));
    } catch (NoSuchMethodException | SecurityException e) {
      assertTrue(
          "Kann Methode " + methodenBezeichner + " in Klasse "
              + klasse.getName() + " nicht finden.", false);
    }
  }

  /**
   * Prüft, ob die Sichtbarkeit der Objektvariablen objektVariablenBezeichner
   * dem Sichtbarkeitsprädikat entspricht.
   * 
   * @param klasse
   *          Klasse in der die Methode getestet werden soll.
   * @param objektVariablenBezeichner
   *          Name der Methode, die überprüft werden soll.
   * @param sichtbarkeitsPraedikat
   *          Dieses Prädikat prüft, ob der Modifizierer den Anforderungen
   *          entspricht.
   */
  protected void pruefeObjektvariablenModifizierer(Class<?> klasse,
      String objektVariablenBezeichner,
      Predicate<Integer> sichtbarkeitsPraedikat) {
    try {
      Field objektVariablenFeld =
          klasse.getDeclaredField(objektVariablenBezeichner);
      objektVariablenFeld.setAccessible(true);
      int modifizierer = objektVariablenFeld.getModifiers();
      assertTrue("Objektvariable " + objektVariablenBezeichner + " in Klasse "
          + klasse.getName()
          + " entspricht nicht der geforderten Sichtbarkeit.",
          sichtbarkeitsPraedikat.test(modifizierer));
    } catch (NoSuchFieldException | SecurityException e) {
      assertTrue("Kann Objektvariable " + objektVariablenBezeichner
          + " in Klasse " + klasse.getName() + " nicht finden.", false);
    }
  }

  /**
   * Testet eine Getter-Methode.
   * 
   * @param instanz
   *          Objekt in dem der Getter getestet wird.
   * @param erwarteterRueckgabeWert
   *          Es soll getestet werden, ob dieser Wert vom Getter zurückgeliefert
   *          wird (der Wert der zugehörigen Objektvariablen wird vorher
   *          gesetzt).
   * @param variablenName
   *          Name der Variablen, die geprüft werden soll.
   */
  protected void testGetter(Object instanz, Object erwarteterRueckgabeWert,
      String variablenName) {
    String methodenBezeichner = erstelleGetterBezeichner(variablenName);
    Class<?>[] parameterTypListe = new Class<?>[0];
    Object[] parameterWertListe = {};

    pruefeMethodenModifizierer(instanz.getClass(), methodenBezeichner,
        parameterTypListe, istPublic);
    setzeObjektvariable(instanz, variablenName, erwarteterRueckgabeWert);
    pruefeHatMethode(instanz.getClass(), methodenBezeichner, parameterTypListe);
    try {
      Object rueckgabeWert =
          werteMethodeAus(instanz, methodenBezeichner, parameterTypListe,
              parameterWertListe);
      assertEquals("Rückgabewert der Methode " + methodenBezeichner
          + " stimmt nicht.", erwarteterRueckgabeWert, rueckgabeWert);
    } catch (Exception e) {
      assertTrue("Fehler beim Aufrufen der Methode " + methodenBezeichner,
          false);
    }
  }

  /**
   * Ruft die angegeben Methode auf und liefert den Rückgabewert der Methode
   * zurück.
   * 
   * @param instanz
   *          Instanz auf die die Methode aufgerufen wird.
   * @param methodenBezeichner
   *          Bezeichner der Methode.
   * @param parameterTypListe
   *          Liste der Parameter-Typen
   * @param parameterWertListe
   *          Liste der Parameter-Werte.
   * @return Methoden-Rückgabewert oder null, falls ein Fehler auftritt.
   */
  protected Object werteMethodeAus(Object instanz, String methodenBezeichner,
      Class<?>[] parameterTypListe, Object[] parameterWertListe)
      throws Exception {

    Method methode = null;
    // Versuche Methode in der aktuellen Klasse zu finden.
    try {
      methode =
          instanz.getClass().getDeclaredMethod(methodenBezeichner,
              parameterTypListe);
    } catch (NoSuchMethodException e1) {
      // Versuche Methode einer Elternklasse zu finden.
      try {
        methode =
            instanz.getClass().getMethod(methodenBezeichner,
                parameterTypListe);
      } catch (NoSuchMethodException e2) {
        // Methode kann nicht gefunden werden.
        return null;
      }
    }

    // Aufrufen der Methode
    try {
      methode.setAccessible(true);
      return methode.invoke(instanz, parameterWertListe);
    } catch (IllegalAccessException | IllegalArgumentException
        | InvocationTargetException | SecurityException e) {
      if (e instanceof InvocationTargetException) {
        Throwable throwable =
            ((InvocationTargetException) e).getTargetException();
        if (throwable instanceof Exception) {
          throw (Exception) throwable;
        }
      }
      return null;
    }
  }

  /**
   * Ruft die angegeben Methode auf und liefert den Rückgabewert der Methode
   * zurück. Bequemlichkeitsmethode: keine Argumente
   * 
   * @param instanz
   *          Instanz auf die die Methode aufgerufen wird.
   * @param methodenBezeichner
   *          Bezeichner der Methode.
   * @return Methoden-Rückgabewert oder null, falls ein Fehler auftritt.
   */
  protected Object werteMethodeAus(Object instanz, String methodenBezeichner) {
    try {
      return werteMethodeAus(instanz, methodenBezeichner, new Class<?>[] {},
          new Object[] {});
    } catch (Exception e) {
      return null;
    }
  }

  /**
   * Ruft die angegeben statische Methode auf und liefert den Rückgabewert der
   * Methode zurück.
   * 
   * @param klasse
   *          Klasse, die die statische Methode anbietet.
   * @param methodenBezeichner
   *          Bezeichner der Methode.
   * @param parameterTypListe
   *          Liste der Parameter-Typen
   * @param parameterWertListe
   *          Liste der Parameter-Werte.
   * @return Methoden-Rückgabewert oder null, falls ein Fehler auftritt.
   */
  protected Object werteStatischeMethodeAus(Class<?> klasse,
      String methodenBezeichner, Class<?>[] parameterTypListe,
      Object[] parameterWertListe) {
    Method methode = null;
    // Versuche Methode in der aktuellen Klasse zu finden.
    try {
      methode = klasse.getDeclaredMethod(methodenBezeichner, parameterTypListe);
    } catch (NoSuchMethodException e1) {
      // Versuche Methode einer Elternklasse zu finden.
      try {
        methode =
            klasse.getDeclaredMethod(methodenBezeichner, parameterTypListe);
      } catch (NoSuchMethodException e2) {
        // Methode kann nicht gefunden werden.
        return null;
      }
    }

    // Aufrufen der Methode
    try {
      if (!(Modifier.isStatic(methode.getModifiers()))) {
        // Hier können nur statische Methoden aufgerufen werden.
        return null;
      }
      methode.setAccessible(true);
      return methode.invoke(null, parameterWertListe);
    } catch (IllegalAccessException | IllegalArgumentException
        | InvocationTargetException | SecurityException e) {
      return null;
    }
  }

  /**
   * Prüft, ob die Methode methodenName mit Parameter-Typen-Liste
   * parameterTypListe existiert.
   * 
   * @param klasse
   *          Klasse in der nach der Methode gesucht wird.
   * @param methodenName
   *          Bezeichner der gesuchten Methode.
   * @param parameterTypListe
   *          Liste der Parametertypen
   */
  protected void pruefeHatMethode(Class<?> klasse, String methodenName,
      Class<?>[] parameterTypListe) {
    try {
      klasse.getDeclaredMethod(methodenName, parameterTypListe);
    } catch (NoSuchMethodException | SecurityException e) {
      assertTrue(
          "Methode " + methodenName
              + " mit der angegebene Parameter-Typ-Liste in Klasse "
              + klasse.getName() + " nicht vorhanden.", false);
    }
  }

  /**
   * Prüft, ob ein Konstruktor mit Parameter-Typen-Liste parameterTypListe
   * existiert.
   * 
   * @param klasse
   *          Klasse in der nach der Methode gesucht wird.
   * @param parameterTypListe
   *          Liste der Parametertypen
   */
  protected void pruefeHatKonstruktor(Class<?> klasse,
      Class<?>[] parameterTypListe) {
    try {
      klasse.getDeclaredConstructor(parameterTypListe);
    } catch (NoSuchMethodException | SecurityException e) {
      assertTrue(
          "Konstruktor mit der angegebene Parameter-Typ-Liste in Klasse "
              + klasse.getName() + " nicht vorhanden.", false);
    }
  }

  /**
   * Erzeugt den Bezeichner für den Getter einer ObjektVariable.
   * 
   * @param objektVariablenBezeichner
   *          Bezeichner der Objektvariablen
   * @return Bezeichner des zugehörigen Getters.
   */
  protected String erstelleGetterBezeichner(String objektVariablenBezeichner) {
    return "get"
        + Character.toUpperCase(objektVariablenBezeichner.charAt(0))
        + objektVariablenBezeichner.substring(1,
            objektVariablenBezeichner.length());
  }

  /**
   * Setzt den Wert der Objektvariable bezeichner in dem Objekt instanz auf
   * wert.
   * 
   * @param instanz
   *          Objekt, dessen Variable gesetzt wird.
   * @param variablenBezeichner
   *          Bezeichner der Variablen, die gesetzt werden soll.
   * @param wert
   *          Wert der gesetzt werden soll.
   */
  protected void setzeObjektvariable(Object instanz,
      String variablenBezeichner, Object wert) {
    try {
      Field variablenFeld =
          instanz.getClass().getDeclaredField(variablenBezeichner);
      variablenFeld.setAccessible(true);
      variablenFeld.set(instanz, wert);
    } catch (NoSuchFieldException | SecurityException e) {
      assertTrue("Kann Variable " + variablenBezeichner + " in Klasse "
          + instanz.getClass().getName() + " nicht finden.", false);
    } catch (IllegalArgumentException e) {
      assertTrue("Kann Wert " + wert + " für Variable " + variablenBezeichner
          + " in Klasse " + instanz.getClass().getName() + " nicht setzen.",
          false);
    } catch (IllegalAccessException e) {
      assertTrue("Kann Wert " + wert + " für Variable " + variablenBezeichner
          + " in Klasse " + instanz.getClass().getName() + " nicht setzen.",
          false);
    }
  }

  /**
   * Liefert den Wert einer Objektvariablen.
   * 
   * @param instanz
   *          Objekt aus dem der Wert gelesen werden soll.
   * @param objektVariablenBezeichner
   *          Bezeichner der Objektvariablen.
   * @return Wert der Variablen; null falls das Auslesen fehlschlägt.
   */
  protected Object getWertObjektVariable(Object instanz,
      String objektVariablenBezeichner) {
    try {
      Field objektVariablenFeld =
          instanz.getClass().getDeclaredField(objektVariablenBezeichner);
      objektVariablenFeld.setAccessible(true);
      return objektVariablenFeld.get(instanz);
    } catch (NoSuchFieldException | SecurityException
        | IllegalArgumentException | IllegalAccessException e) {
      assertTrue("Objektvariable " + objektVariablenBezeichner
          + " nicht gefunden oder Zugriff nicht erfolgreich.", false);
    }
    return null;
  }

  /**
   * Liefert den Wert einer geerbten Objektvariablen (nur direkte
   * Elternklasse!).
   * 
   * @param instanz
   *          Objekt aus dem der Wert gelesen werden soll.
   * @param objektVariablenBezeichner
   *          Bezeichner der Objektvariablen.
   * @return Wert der Variablen; null falls das Auslesen fehlschlägt.
   */
  protected Object getWertObjektVariableElternklasse(Object instanz,
      String objektVariablenBezeichner) {
    try {
      Field objektVariablenFeld =
          instanz.getClass().getSuperclass()
              .getDeclaredField(objektVariablenBezeichner);
      objektVariablenFeld.setAccessible(true);
      return objektVariablenFeld.get(instanz);
    } catch (NoSuchFieldException | SecurityException
        | IllegalArgumentException | IllegalAccessException e) {
      assertTrue("Objektvariable " + objektVariablenBezeichner
          + " nicht gefunden oder Zugriff nicht erfolgreich.", false);
    }
    return null;
  }

  /**
   * Testet, ob die Objektvariable mit dem Namen bezeichner in der Instance
   * instanz den Wert erwarteterWert hat.
   * 
   * @param instanz
   *          Instanz der Klasse, die überprüft wird.
   * @param variablenBezeichner
   *          Bezeichner der Objektvariable, die geprüft werden soll
   * @param erwarteterWert
   *          Erwarteter Wert der Variablen.
   */
  protected void testWertVonObjektvariable(Object instanz,
      String variablenBezeichner, Object erwarteterWert) {
    try {
      Field nameFeld = instanz.getClass().getDeclaredField(variablenBezeichner);
      nameFeld.setAccessible(true);
      Object wert = nameFeld.get(instanz);
      assertEquals("Objektvariable " + variablenBezeichner + " nicht mit "
          + erwarteterWert + " im Default-Konstruktor initialisiert.",
          erwarteterWert, wert);
    } catch (IllegalArgumentException | IllegalAccessException
        | NoSuchFieldException | SecurityException e) {
      assertTrue("Fehler beim Zugriff auf die Objektvariable "
          + variablenBezeichner, false);
    }
  }

  /**
   * Prüft, ob die Klasse eine Objektvariable bezeichner vom Typ typ hat.
   * 
   * @param klasse
   *          Klasse, die überprüft werden soll.
   * @param variablenBezeichner
   *          Name der Objektvariable
   * @param typ
   *          Erwarteter Typ der Objektvariable.
   */
  protected void testHatObjektVariable(Class<?> klasse,
      String variablenBezeichner, Class<?> typ) {
    try {
      Field field = klasse.getDeclaredField(variablenBezeichner);
      assertNotNull("Objektvariable '" + variablenBezeichner
          + "' nicht gefunden.", field);
      assertEquals("Objektvariable '" + variablenBezeichner
          + "' hat falschen Typ", typ, field.getType());
    } catch (NoSuchFieldException | SecurityException e) {
      assertTrue(
          "Objektvariable '" + variablenBezeichner + "' nicht gefunden.", false);
    }
  }

  /**
   * Prüft ob die Klasse klasse das Interface iface implementiert.
   * 
   * @param klasse
   *          Klasse, die das Interface implementieren soll.
   * @param iface
   *          Interface auf das geprüft wird.
   */
  protected void testImplementiertInterface(Class<?> klasse, Class<?> iface) {
    Class<?>[] interfaces = klasse.getInterfaces();
    boolean interfaceGefunden = false;
    for (Class<?> interfaceCandidate : interfaces) {
      if (iface == interfaceCandidate) {
        interfaceGefunden = true;
        break;
      }
    }
    assertTrue("Klasse " + klasse.getName() + " implementiert das Interface "
        + iface.getName() + " nicht.", interfaceGefunden);
  }

  protected void pruefeMethodeWirftException(Class<?> klasse,
      String methodenBezeichner, Class<?>[] parameterTypeListe,
      Class<?> exceptionKlasse) {
    try {
      Method methode =
          klasse.getDeclaredMethod(methodenBezeichner, parameterTypeListe);
      Class<?>[] exceptions = methode.getExceptionTypes();

      assertTrue("Method " + methodenBezeichner
          + " deklariert nicht die Exception " + exceptionKlasse.getName(),
          new HashSet<Class<?>>(Arrays.asList(exceptions))
              .contains(exceptionKlasse));

    } catch (NoSuchMethodException | SecurityException e) {
      assertTrue("Zugriff auf Methode " + methodenBezeichner
          + " fehlgeschlagen.", false);
    }
  }

  /**
   * Erzeugt eine Instanz der angegebenen Klasse. Bequemlichkeitsmethode für
   * erzeugeInstanz(Class<?> [] typen, Object [] parameter);
   * 
   * @param klasse
   *          Klasse die instanziiert werden soll.
   * @return Erzeugtes Objekt, null, wenn etwas schief läuft.
   */
  protected Object erzeugeInstanz(Class<?> klasse) {
    return erzeugeInstanz(klasse, new Class<?>[] {}, new Object[] {});
  }

  /**
   * Erzeugt eine Instanz der angegebenen Klasse. Bequemlichkeitsmethode für
   * erzeugeInstanz(Class<?> [] typen, Object [] parameter);
   * 
   * @param klasse
   *          Klasse die instanziiert werden soll.
   * @param typen
   *          Liste der Parameter-Typen.
   * @param werte
   *          Liste der Parameter-Werte.
   * @return Erzeugtes Objekt, null, wenn etwas schief läuft.
   */
  protected Object erzeugeInstanz(Class<?> klasse, Class<?>[] typen,
      Object[] werte) {
    try {
      Constructor<?> konstruktor = klasse.getConstructor(typen);
      return konstruktor.newInstance(werte);
    } catch (NoSuchMethodException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException
        | InvocationTargetException e) {
      return null;
    }
  }

  /**
   * Erzeugt eine Instanz der angegebenen Klasse, wobei die Parameter als vargs
   * gegeben sind. Bequemlichkeitsmethode für erzeugeInstanz(Class<?> [] typen,
   * Object [] parameter);
   * 
   * @param klasse
   *          Klasse die instanziiert werden soll.
   * @param typen
   *          Liste der Parameter-Typen.
   * @param werte
   *          Liste der Parameter-Werte.
   * @return Erzeugtes Objekt, null, wenn etwas schief läuft.
   */
  protected Object erzeugeInstanzVarargs(Class<?> klasse, Class<?>[] typen,
      Object[] werte) {
    try {
      Constructor<?> konstruktor = klasse.getConstructor(typen);
      return konstruktor.newInstance((Object) werte);
    } catch (NoSuchMethodException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException
        | InvocationTargetException e) {
      return null;
    }
  }

  /**
   * Liefert das Class-Objekt des enums enumBezeichner in der Klasse klasse;
   * 
   * @param klasse
   *          Klasse in der nach dem Enum gesucht wird.
   * @param enumBezeichner
   *          Bezeichner des Enums
   * @return Class-Objekt, falls der Enum existiert, ansonsten null;
   */
  public Class<?> getEnum(Class<?> klasse, String enumBezeichner) {
    try {
      Class<?>[] innereKlassen = klasse.getDeclaredClasses();
      for (Class<?> innereKlasse : innereKlassen) {
        if (innereKlasse.getName().endsWith(enumBezeichner)) {
          if (innereKlasse.isEnum()) {
            return innereKlasse;
          }
        }
      }
      return null;
    } catch (SecurityException e) {
      return null;
    }
  }

  /**
   * Liefert die enum-Konstante zu einem Bezeichner
   * 
   * @param enumKlasse
   *          Klassen-Objekt des enums.
   * @param konstantenBezeichner
   *          Bezeichner der Konstante
   * @return Gesuchte Konstante oder null, falls sie nicht gefunden werden kann.
   */
  protected Object getEnumKonstante(Class<?> enumKlasse,
      String konstantenBezeichner) {
    if (!enumKlasse.isEnum()) {
      return null;
    }
    Object[] konstanten = enumKlasse.getEnumConstants();
    if (konstanten == null) {
      return null;
    }
    return werteStatischeMethodeAus(enumKlasse, METHODE_VALUE_OF,
        new Class<?>[] { String.class }, new Object[] { konstantenBezeichner });
  }

  /**
   * Liefert ein Array der Konstanten des Enums.
   * 
   * @param enumKlasse
   *          Klassen-Objekt des enums.
   * @return Array der Konstanten, null, falls ein Fehler aufgetreten ist.
   */
  protected Object[] getEnumKonstanten(Class<?> enumKlasse) {
    if (!enumKlasse.isEnum()) {
      return null;
    }
    Object[] konstanten = enumKlasse.getEnumConstants();
    return konstanten;
  }
}
