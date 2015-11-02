package aufgabenblatt1;

public class StudentenEintrag implements Comparable<StudentenEintrag> {

	private final String vorname;

	private final String nachname;

	private final int nummer;

	public StudentenEintrag(String vorname, String nachname, int nummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer = nummer;
	}

	@Override
	public int compareTo(StudentenEintrag andererEintrag) {

		return getNummer().compareTo(andererEintrag.getNummer());
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public Integer getNummer() {
		return nummer;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s |", getVorname(), getNachname(),
				getNummer());
	}
}
