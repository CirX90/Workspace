package aufgabenblatt1;

public class StudentenEintrag implements Comparable<StudentenEintrag> {
	
	private String vorname = "";
	private String nachname = "";
	private int matrikelnummer;
	
	public StudentenEintrag(int matrikelnummer, String nachname, String vorname) {
		this.matrikelnummer = matrikelnummer;
		this.nachname = nachname;
		this.vorname = vorname;
		
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public Integer getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * Methode zum Vergleichen der Nachnamen. if Bedingung
	 */
	
	@Override
	public int compareTo(StudentenEintrag andererEintrag) {
		if (getNachname().compareTo(andererEintrag.getNachname()) == 0) {
			return getVorname().compareTo(andererEintrag.getVorname());
			
		}
		return getMatrikelnummer().compareTo(andererEintrag.getMatrikelnummer());
	}
	
	@Override
	  public String toString() {
	    return String.format("/ %s, %s, %s / ",getMatrikelnummer(), getNachname(), getVorname());
	  }

}