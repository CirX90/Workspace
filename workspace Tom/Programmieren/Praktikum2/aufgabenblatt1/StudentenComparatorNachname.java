package aufgabenblatt1;

import java.util.Comparator;

/**
 * Comparator Klasse, dient der Vergleichsmöglichkeit der Studenten nach
 * Nachnamen über das implementierte Interface Comparator.
 * 
 * @author Tom Hertel
 *
 */

public class StudentenComparatorNachname implements
		Comparator<StudentenEintrag> {

	/**
	 * Implementierte compare Methode zum Vergleichen nach Nachname. Sollte
	 * dieser gleich sein werden die Einträge nach Vorname sortiert und
	 * zurückgegeben.
	 */

	@Override
	public int compare(StudentenEintrag student1, StudentenEintrag student2) {
		if (student1.getNachname().compareTo(student2.getNachname()) == 0) {
			return student1.getVorname().compareTo(student2.getVorname());

		}
		return student1.getNachname().compareTo(student2.getNachname());
	}

}