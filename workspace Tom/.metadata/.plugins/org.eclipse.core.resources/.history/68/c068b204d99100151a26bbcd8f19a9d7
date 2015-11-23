/**
 * Praktikum TI-PM Gruppe 2, SS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Milan Hering 	 (milan.hering@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 5, Aufgabe 4
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt5;

import java.util.Scanner;

/**
 * Dieses Programm dient als Möglichkeit um einen einheitlichen Zugriff auf die
 * anderen Programme zu erhalten. Dafür werden Aufzählungstypen und eine
 * Stringeingabe genutzt.
 * 
 * @author Tom Hertel
 *
 */

public class StringVerarbeitung {

	/**
	 * Objektvariable der Aufzählungstypen.
	 */

	private Aufzaehlung aufzaehlung;

	/**
	 * Objektvariable der Klasse Verschluesselung.
	 */

	private Verschluesselung schluessel = new Verschluesselung();

	/**
	 * Objektvariable der Klasse VokaleZaehlen.
	 */

	private VokaleZaehlen vokale = new VokaleZaehlen();

	/**
	 * Objektvariable der Klasse Palindrom.
	 */

	private Palindrom palindrom = new Palindrom();

	/**
	 * Objektvariable vom Typ String, dient als Ablegeort der Texteingabe des
	 * Benutzers.
	 */

	private String eingabe;

	/**
	 * Objektvariable vom Typ Scanner, dient als Möglichkeit eine Scannereingabe
	 * zu tätigen.
	 */

	private Scanner scanner = new Scanner(System.in);

	/**
	 * Konstruktor, Objekt der Klasse wird mit einem Aufzählungstyp erstellt.
	 * 
	 * @param aufzaehlung
	 */

	public StringVerarbeitung(Aufzaehlung aufzaehlung) {
		this.aufzaehlung = aufzaehlung;
	}

	/**
	 * Aufzählungsmethode mit den einzelnen Varianten.
	 */

	public enum Aufzaehlung {
		VERSCHLUESSELN, ENTSCHLUESSELN, PALINDROM, VOKALE

	}

	/**
	 * Zu verarbeitende Texteingabe des Benutzers.
	 * 
	 * @return eingabe
	 */

	public String eingabe() {

		System.out.println("Bitte Text für die Verarbeitung eingeben.");
		eingabe = scanner.nextLine();
		scanner.close();
		return eingabe;

	}

	/**
	 * Methode zur Verarbeitung der Eingabe des Benutzers. Durch eine
	 * Switch-Case Bedingung besteht die Möglichkeit auf die verschiedenen
	 * Aufzählungstypen zuzugreifen und die entsprechenden Unterprogramme
	 * auszuführen.
	 * 
	 * @param eingabe
	 * @param aufzaehlung
	 */

	public void verarbeitung(String eingabe, Aufzaehlung aufzaehlung) {

		switch (aufzaehlung) {
		case VERSCHLUESSELN:
			schluessel.setEingabe(eingabe);
			schluessel.verarbeiteEingabe();
			schluessel.verschluesseln();
			break;
		case ENTSCHLUESSELN:
			schluessel.setEingabe(eingabe);
			schluessel.verarbeiteEingabe();
			schluessel.entschluesseln(eingabe);
			break;
		case VOKALE:
			vokale.setEingabe(eingabe);
			vokale.filterGross();
			vokale.filterKlein();
			vokale.ausgabe();
			break;
		case PALINDROM:
			palindrom.ausgabe(palindrom.getLaengstesPalindrom(eingabe));

		}

	}

	/**
	 * Mainmethode in der ein Referenzobjekt der Klasse mit dem Argument der
	 * gewünschten Verarbeitungsart erstellt wird. Aufrufen der Methoden.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		StringVerarbeitung ausfuehren = new StringVerarbeitung(
				Aufzaehlung.PALINDROM);
		ausfuehren.verarbeitung(ausfuehren.eingabe(), ausfuehren.aufzaehlung);

	}

}