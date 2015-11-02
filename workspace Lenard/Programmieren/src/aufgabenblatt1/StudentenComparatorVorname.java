package aufgabenblatt1;

import java.util.Comparator;

public class StudentenComparatorVorname implements Comparator<StudentenEintrag> {

	@Override
	public int compare(StudentenEintrag student1, StudentenEintrag student2) {
		if (student1.getVorname().compareTo(student2.getVorname()) == 0) {
			return student1.getNachname().compareTo(student2.getNachname());

		}
		return student1.getVorname().compareTo(student2.getVorname());
	}
}
