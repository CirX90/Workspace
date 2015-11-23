package aufgabenblatt1;

public class StudentenEintrag implements Comparable<StudentenEintrag> {
	
	/**
	 * Deklaration einer Variable für den String eines Vornamens von Studenten.
	 */

	private String vorname = "";
	
	/**
	 * Deklaration einer Variable für den String eines Nachnamen von Studenten.
	 */
	
	private String nachname = "";
	
	/**
	 * Deklaration eine Variable int einer Matrikelnummer von Studenten.
	 */
	
	private int matrikelnummer;
	
	/**
	 * Konstruktor.
	 * @param matrikelnummer
	 * @param nachname
	 * @param vorname
	 */

	public StudentenEintrag(int matrikelnummer, String nachname, String vorname) {
		this.matrikelnummer = matrikelnummer;
		this.nachname = nachname;
		this.vorname = vorname;

	}
	
	/**
	 * Getter für Vorname der Studenten.
	 * @return vorname
	 */

	public String getVorname() {
		return vorname;
	}
	
	/**
	 * Getter für Nachname der Studenten.
	 * @return nachname
	 */

	public String getNachname() {
		return nachname;
	}
	
	/**
	 * Getter für Matrikelnummer der Studenten.
	 * @return matrikelnummer
	 */

	public Integer getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * Methode zum Vergleichen der Matrikelnummern.
	 */

	@Override
	public int compareTo(StudentenEintrag andererEintrag) {

		return getMatrikelnummer()
				.compareTo(andererEintrag.getMatrikelnummer());
	}
	
	/**
	 * Methode zum Formatieren der Ausgabe.
	 */

	@Override
	public String toString() {
		return String.format(
				"/ Matrikelnummer: %s, Nachname: %s, Vorname: %s / ",
				getMatrikelnummer(), getNachname(), getVorname());
	}

}