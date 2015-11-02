package aufgabenblatt1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	private List<StudentenEintrag> student = new LinkedList<StudentenEintrag>();

	public void eintragHinzufuegen(int martikelnummer, String nachname,
			String vorname) {
		student.add(new StudentenEintrag(vorname, nachname, martikelnummer));
	}

	public void sortierenMatrikelnummer() {
		Collections.sort(student);
	}

	public void sortierenNachname() {
		Collections.sort(student, new StudentenComparatorNachname());
	}

	public void sortierenVorname() {
		Collections.sort(student, new StudentenComparatorVorname());
	}

	@Override
	public String toString() {
		// Hinweis: Lösung mit Lambdas -> PM2, Idee: Einträge als Stream, jeden
		// Eintrag in String konvertieren (map), Strings konkatenieren
		// (collect).
		return student.stream().map((StudentenEintrag eintrag) -> {
			return eintrag.toString();
		}).collect(Collectors.joining(","));
	}

}
