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
	 * Es sollen Studenten und dazugeh�rige Namen und Martikelnummern in die
	 * Liste eingetragen werden.
	 */

	public void eintragHinzufuegen(int martikelnummer, String nachname,
			String vorname) {
		student.add(new StudentenEintrag(martikelnummer, nachname, vorname));
	}
	
	public void leistungHinzufuegen(String modulname, int note) {
		leistung.add(new Pruefungsleistung(modulname, note));
	}

	public void sortierenMatrikelnummer() {
		// Verwendung des Interfaces Comparable in StudentenEintrag
		Collections.sort(student);

	}
	
	public void sortierenNachname() {

		// Verwendung eines Komparators
		Collections.sort(student, new StudentenComparatorNachname());
	}
	
	public void sortierenVorname() {

		// Verwendung eines Komparators
		Collections.sort(student, new StudentenComparatorVorname());
	}

	@Override
	public String toString() {
		// Hinweis: L�sung mit Lambdas -> PM2, Idee: Eintr�ge als Stream, jeden
		// Eintrag in String konvertieren (map), Strings konkatenieren
		// (collect).
		return student.stream().map((StudentenEintrag eintrag) -> {
			return eintrag.toString();
		}).collect(Collectors.joining(", "));
	}

}