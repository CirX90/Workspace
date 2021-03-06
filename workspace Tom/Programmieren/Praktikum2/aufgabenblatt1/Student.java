/**
 * Praktikum TI-PM2, WS 2015
 * Gruppe: Tom-Henrik Hertel (tom-henrik.hertel@haw-hamburg.de)
 * 		   Lenard Lange 	 (lenard.lange@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1.2
 * Verwendete Quellen: Vorlesungsfolien
 */

package aufgabenblatt1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	/**
	 * Die Liste der Studenten wird als Collection (List) verwaltet.
	 **/

	private List<StudentenEintrag> student = new LinkedList<StudentenEintrag>();

	/**
	 * Die Liste der Pruefungsleistung wird als Collection (List) verwaltet.
	 **/

	private List<Pruefungsleistung> leistung = new LinkedList<Pruefungsleistung>();

	/**
	 * Es werden Studenten und dazugeh�rige Namen und Martikelnummern in die
	 * Liste eingetragen.
	 */

	public void eintragHinzufuegen(int martikelnummer, String nachname,
			String vorname) {
		student.add(new StudentenEintrag(martikelnummer, nachname, vorname));
	}

	/**
	 * Es werden Pr�fungsleistungen und dazugeh�rige Modulnamen und Noten in die
	 * Liste eingetragen.
	 */

	public void leistungHinzufuegen(String modulname, int note) {
		leistung.add(new Pruefungsleistung(modulname, note));
	}

	/**
	 * Methode zum Sortieren der Studenten nach Matrikelnummern.
	 */

	public void sortierenMatrikelnummer() {
		
		// Verwendung des Interfaces Comparable in StudentenEintrag
		Collections.sort(student);

	}

	/**
	 * Methode zum Sortieren der Studenten nach Nachname.
	 */

	public void sortierenNachname() {

		// Verwendung eines Komparators
		Collections.sort(student, new StudentenComparatorNachname());
	}

	/**
	 * Methode zum Sortieren der Studenten nach Vorname.
	 */

	public void sortierenVorname() {

		// Verwendung eines Komparators
		Collections.sort(student, new StudentenComparatorVorname());
	}

	/**
	 * Methode zum Formatieren der Ausgabe.
	 */

	@Override
	public String toString() {

		// Strings konkatenieren (collect).
		return student.stream().map((StudentenEintrag eintrag) -> {
			return eintrag.toString();
		}).collect(Collectors.joining(", "));
	}

}