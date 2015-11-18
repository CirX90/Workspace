package aufgabenblatt1;

import java.util.Comparator;

/**
 * Comparator Klasse, dient der Vergleichsm�glichkeit der Studenten nach
 * Nachnamen �ber das implementierte Interface Comparator.
 * 
 * @author Tom Hertel
 *
 */

public class StudentenComparatorNachname implements
		Comparator<StudentenEintrag> {

	/**
	 * Implementierte compare Methode zum Vergleichen nach Nachname. Sollte
	 * dieser gleich sein werden die Eintr�ge nach Vorname sortiert und
	 * zur�ckgegeben.
	 */

	@Override
	public int compare(StudentenEintrag student1, StudentenEintrag student2) {
		if (student1.getNachname().compareTo(student2.getNachname()) == 0) {
			return student1.getVorname().compareTo(student2.getVorname());

		}
		return student1.getNachname().compareTo(student2.getNachname());
	}

}