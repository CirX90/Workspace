package aufgabenblatt1;

import java.util.Comparator;

/**
 * Comparator Klasse, dient der Vergleichsmöglichkeit der Studenten nach
 * Nachnamen über das implementierte Interface Comparator.
 * 
 * @author Tom Hertel
 *
 */

public class StudentenComparatorVorname implements Comparator<StudentenEintrag> {

	/**
	 * Implementierte compare Methode zum Vergleichen nach Nachname. Sollte
	 * dieser gleich sein werden die Einträge nach Vorname sortiert und
	 * zurückgegeben.
	 */

	@Override
	public int compare(StudentenEintrag student1, StudentenEintrag student2) {
		if (student1.getVorname().compareTo(student2.getVorname()) == 0) {
			return student1.getNachname().compareTo(student2.getNachname());

		}
		return student1.getVorname().compareTo(student2.getVorname());
	}

}