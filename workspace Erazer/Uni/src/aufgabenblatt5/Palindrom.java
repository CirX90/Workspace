/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 5, Aufgabe 3
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt5;

/**
 * Dieses Programm dient dazu, aus einem Wort ein m�gliches Palindrom, also ein
 * Wort, welches man sowohl von vorne als auch von hinten gleich liest,
 * herauszufilern und dieses auszugeben.
 * 
 * @author Tom Hertel
 */

public class Palindrom {

	/**
	 * Hilfsmethode, in der Strings darauf gepr�ft werden ob sie komplette
	 * Palindrome sind. Dazu wird ein zweiter String aus dem umgedrehten Ersten
	 * erstellt. In einer Bedingung wird gepr�ft ob der Eingabestring mit dem
	 * Gespiegelten gleich ist. Dabei wird keine R�cksicht auf Gro�- und
	 * Kleinschreibung genommen.
	 * 
	 * @param eingabe
	 * @return true - wenn das Wort ein komplettes Palindrom ist.
	 * @return false - wenn das Wort kein komplettes Palindrom ist.
	 */

	public boolean isPalindrom(String eingabe) {

		String spiegelEingabe = new StringBuffer(eingabe).reverse().toString();

		if (eingabe.equalsIgnoreCase(spiegelEingabe) == true) {

			return true;

		}

		return false;

	}

	/**
	 * Erste Bedingung pr�ft ob Inhalt der Eingabe null ist und wird
	 * dementsprechend weitergegeben. Falls fester Inhalt, wird dieser String in
	 * alle m�glichen Unterstrings geteilt und getestet ob diese ein Palindrom
	 * sind. Das bis dahin erhaltene Ergebnis wird dann jede Runde mit neuen
	 * Palindromen verglichen und das l�ngste wird behalten.
	 * 
	 * @param eingabe
	 * @return ergebnis - l�ngstes Palindrom.
	 */

	public String getLaengstesPalindrom(String eingabe) {

		String ergebnis = "";

		if (eingabe == null) {
			ergebnis = "Kein Inhalt entdeckt";

		} else {

			for (int startIndex = 0; startIndex < eingabe.length(); startIndex++) {
				for (int laenge = 1; laenge <= eingabe.length() - startIndex; laenge++) {
					String testString = eingabe.substring(startIndex,
							startIndex + laenge);
					if (eingabe.contains(testString)
							&& testString.length() > ergebnis.length()
							&& isPalindrom(testString) == true) {
						ergebnis = testString;
					}
				}
			}
		}

		if (ergebnis.length() == 1) {
			ergebnis = "Es wurde kein Palindrom gefunden";
		}

		return ergebnis;

	}

	/**
	 * Ausgabe des zur�ckgegebenen Strings mit dem l�ngsten Palindrom als
	 * Inhalt.
	 * 
	 * @param ergebnis
	 *            - l�ngstes Palindrom.
	 */

	public void ausgabe(String ergebnis) {

		System.out.println("Palindromfilterung ergibt: " + ergebnis + ".");

	}

}