package aufgabenblatt1;

import java.util.Comparator;

public class StudentenComparator implements Comparator<StudentenEintrag> {

	@Override
	public int compare(StudentenEintrag eintrag1, StudentenEintrag eintrag2) {
		    return eintrag1.compareTo(eintrag2);
	}

}