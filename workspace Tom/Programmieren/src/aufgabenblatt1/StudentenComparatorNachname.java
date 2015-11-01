package aufgabenblatt1;

import java.util.Comparator;

public class StudentenComparatorNachname implements Comparator<StudentenEintrag> {

	@Override
	public int compare(StudentenEintrag student1, StudentenEintrag student2) {
		if (student1.getNachname().compareTo(student2.getNachname()) == 0) {
			return student1.getVorname().compareTo(student2.getVorname());

		}
		return student1.getNachname().compareTo(student2.getNachname());
	}

}